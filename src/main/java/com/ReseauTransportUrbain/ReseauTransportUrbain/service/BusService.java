package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.RequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Bus;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.BusRepository;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ConducteurRepository;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.LigneRepository;
import org.springframework.stereotype.Service;

/**
 * Service métier gérant les Bus.
 * Fournit les opérations CRUD et les conversions entité/DTO.
 * L'entité Bus ne porte que les identifiants ligneId et conducteurId :
 * la conversion résout donc la ligne et le conducteur auprès de leur repository.
 * La lecture (getAll, getById) et la suppression sont héritées
 * de {@link AbstractCrudService}.
 */
@Service
public class BusService extends AbstractCrudService {
    private final BusRepository busRepository;
    private final LigneRepository ligneRepository;
    private final ConducteurRepository conducteurRepository;
    private final LigneService ligneService;
    private final ConducteurService conducteurService;

    /**
     * Constructeur injectant les repositories et services de conversion.
     *
     * @param busRepository le repository des bus
     * @param ligneRepository le repository des lignes
     * @param conducteurRepository le repository des conducteurs
     * @param ligneService le service des lignes (conversion)
     * @param conducteurService le service des conducteurs (conversion)
     */
    public BusService(BusRepository busRepository,
                      LigneRepository ligneRepository,
                      ConducteurRepository conducteurRepository,
                      LigneService ligneService,
                      ConducteurService conducteurService) {
        super(busRepository);
        this.busRepository = busRepository;
        this.ligneRepository = ligneRepository;
        this.conducteurRepository = conducteurRepository;
        this.ligneService = ligneService;
        this.conducteurService = conducteurService;
    }

    /**
     * Construit une entité Bus à partir des données de la requête.
     *
     * @param busRequest Les données de la requête (BusRequestDto)
     * @param ligneId L'identifiant de la ligne associée
     * @param conducteurId L'identifiant du conducteur associé
     * @return L'entité Bus construite
     */
    public Bus toEntity(BusRequestDto busRequest, Long ligneId, Long conducteurId) {
        Bus bus = new Bus();
        bus.setCode(busRequest.getCode());
        bus.setCapacite(busRequest.getCapacite());
        bus.setDepot(busRequest.getDepot());
        bus.setLigneId(ligneId);
        bus.setConducteurId(conducteurId);
        return bus;
    }

    /**
     * Convertit une entité Bus en DTO de réponse, avec sa ligne et son conducteur.
     *
     * @param entity L'entité Bus à convertir
     * @return L'objet ResponseDto correspondant
     */
    @Override
    public ResponseDto toDto(Object entity) {
        Bus bus = (Bus) entity;
        BusResponseDto dto = new BusResponseDto();
        dto.setId(bus.getId());
        dto.setCode(bus.getCode());
        dto.setCapacite(bus.getCapacite());
        dto.setDepot(bus.getDepot());
        if (bus.getLigneId() != null) {
            ligneRepository.findById(bus.getLigneId()).ifPresent(ligne ->
                    dto.setLigne((LigneResponseDto) ligneService.toDto(ligne)));
        }
        if (bus.getConducteurId() != null) {
            conducteurRepository.findById(bus.getConducteurId()).ifPresent(conducteur ->
                    dto.setConducteur((ConducteurResponseDto) conducteurService.toDto(conducteur)));
        }
        return dto;
    }

    /**
     * Crée une nouvelle entité Bus à partir des données fournies.
     *
     * @param request Les données de la requête (BusRequestDto)
     * @return L'objet ResponseDto correspondant au bus créé
     */
    @Override
    public ResponseDto create(RequestDto request) {
        BusRequestDto busRequest = (BusRequestDto) request;
        Bus bus = toEntity(busRequest, busRequest.getLigneId(), busRequest.getConducteurId());
        return toDto(busRepository.save(bus));
    }

    /**
     * Met à jour l'entité Bus existante à partir des données fournies.
     *
     * @param id L'identifiant de l'entité Bus à modifier
     * @param request Les données de la requête (BusRequestDto)
     * @return L'objet ResponseDto correspondant au bus modifié
     * @throws RuntimeException Si l'entité Bus n'existe pas
     */
    @Override
    public ResponseDto update(Long id, RequestDto request) {
        BusRequestDto busRequest = (BusRequestDto) request;
        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus non trouvé"));
        bus.setCode(busRequest.getCode());
        bus.setCapacite(busRequest.getCapacite());
        bus.setDepot(busRequest.getDepot());
        bus.setLigneId(busRequest.getLigneId());
        bus.setConducteurId(busRequest.getConducteurId());
        return toDto(busRepository.save(bus));
    }
}
