package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Conducteur;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ConducteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConducteurService {
    private final ConducteurRepository conducteurRepository;

    public ConducteurService(ConducteurRepository conducteurRepository) {
        this.conducteurRepository = conducteurRepository;
    }

    public Conducteur toEntity(ConducteurRequestDto conducteurRequest) {
        Conducteur conducteur = new Conducteur();
        conducteur.setNom(conducteurRequest.getNom());
        conducteur.setMatricule(conducteurRequest.getMatricule());
        conducteur.setNumeroPermis(conducteurRequest.getNumeroPermis());
        return conducteur;
    }

    public ConducteurResponseDto toDto(Conducteur conducteur) {
        ConducteurResponseDto dto = new ConducteurResponseDto();
        dto.setId(conducteur.getId());
        dto.setNom(conducteur.getNom());
        dto.setMatricule(conducteur.getMatricule());
        dto.setNumeroPermis(conducteur.getNumeroPermis());
        return dto;
    }

    public List<ConducteurResponseDto> getAllConducteurs() {
        return conducteurRepository.findAll().stream().map(this::toDto).toList();
    }

    public ConducteurResponseDto getConducteurById(Long id) {
        Conducteur conducteur = conducteurRepository.findById(id).orElseThrow(() -> new RuntimeException("Conducteur non trouvé"));
        return toDto(conducteur);
    }

    public ConducteurResponseDto createConducteur(ConducteurRequestDto conducteurRequest) {
        Conducteur conducteur = toEntity(conducteurRequest);
        conducteurRepository.save(conducteur);
        return getConducteurById(conducteur.getId());
    }

    public ConducteurResponseDto updateConducteurById(Long id, ConducteurRequestDto conducteurRequest) {
        Conducteur conducteur = conducteurRepository.findById(id).orElseThrow(() -> new RuntimeException("Conducteur non trouvé"));
        conducteur.setNom(conducteurRequest.getNom());
        conducteur.setMatricule(conducteurRequest.getMatricule());
        conducteur.setNumeroPermis(conducteurRequest.getNumeroPermis());
        conducteurRepository.save(conducteur);
        return getConducteurById(id);
    }

    public ConducteurResponseDto deleteConducteurById(Long id) {
        ConducteurResponseDto dto = getConducteurById(id);
        conducteurRepository.deleteById(id);
        return dto;
    }
}