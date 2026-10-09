package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Bus;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Conducteur;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Ligne;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;
    private final LigneService ligneService;
    private final ConducteurService conducteurService;

    public BusService(BusRepository busRepository, LigneService ligneService, ConducteurService conducteurService) {
        this.busRepository = busRepository;
        this.ligneService = ligneService;
        this.conducteurService = conducteurService;
    }

    public Bus toEntity(BusRequestDto busRequest, Long ligneId, Long conducteurId) {
        Bus bus = new Bus();
        bus.setCode(busRequest.getCode());
        bus.setCapacite(busRequest.getCapacite());
        bus.setDepot(busRequest.getDepot());
        bus.setLigneId(ligneId);
        bus.setConducteurId(conducteurId);
        return bus;
    }

    public BusResponseDto toDto(Bus bus) {
        BusResponseDto dto = new BusResponseDto();
        dto.setId(bus.getId());
        dto.setCode(bus.getCode());
        dto.setCapacite(bus.getCapacite());
        dto.setDepot(bus.getDepot());
        return dto;
    }

    public BusResponseDto toDto(Bus bus, Ligne ligne, Conducteur conducteur) {
        BusResponseDto dto = toDto(bus);
        if (ligne != null) {
            dto.setLigne(ligneService.toDto(ligne));
        }
        if (conducteur != null) {
            dto.setConducteur(conducteurService.toDto(conducteur));
        }
        return dto;
    }

    public List<BusResponseDto> getAllBus() {
        return busRepository.findAllWithRelations().stream()
                .map(r -> toDto((Bus) r[0], (Ligne) r[1], (Conducteur) r[2]))
                .toList();
    }

    public BusResponseDto getBusById(Long id) {
        Object[] r = busRepository.findByIdWithRelations(id).stream().findFirst().orElseThrow(() -> new RuntimeException("Bus non trouvé"));
        return toDto((Bus) r[0], (Ligne) r[1], (Conducteur) r[2]);
    }

    public BusResponseDto createBus(BusRequestDto busRequest) {
        Bus bus = toEntity(busRequest, busRequest.getLigneId(), busRequest.getConducteurId());
        busRepository.save(bus);
        return getBusById(bus.getId());
    }

    public BusResponseDto updateBusById(Long id, BusRequestDto busRequest) {
        Bus bus = busRepository.findById(id).orElseThrow(() -> new RuntimeException("Bus non trouvé"));
        bus.setCode(busRequest.getCode());
        bus.setCapacite(busRequest.getCapacite());
        bus.setDepot(busRequest.getDepot());
        bus.setLigneId(busRequest.getLigneId());
        bus.setConducteurId(busRequest.getConducteurId());
        busRepository.save(bus);
        return getBusById(id);
    }

    public BusResponseDto deleteBusById(Long id) {
        BusResponseDto dto = getBusById(id);
        busRepository.deleteById(id);
        return dto;
    }
}
