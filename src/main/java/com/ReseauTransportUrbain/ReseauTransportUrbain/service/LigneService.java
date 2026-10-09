package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Ligne;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.LigneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneService {
    private final LigneRepository ligneRepository;

    public LigneService(LigneRepository ligneRepository) {
        this.ligneRepository = ligneRepository;
    }

    public Ligne toEntity(LigneRequestDto ligneRequest) {
        Ligne ligne = new Ligne();
        ligne.setCode(ligneRequest.getCode());
        ligne.setZone(ligneRequest.getZone());
        ligne.setLibelle(ligneRequest.getLibelle());
        ligne.setTerminusDepart(ligneRequest.getTerminusDepart());
        ligne.setTerminusArrivee(ligneRequest.getTerminusArrivee());
        return ligne;
    }

    public LigneResponseDto toDto(Ligne ligne) {
        LigneResponseDto dto = new LigneResponseDto();
        dto.setId(ligne.getId());
        dto.setCode(ligne.getCode());
        dto.setZone(ligne.getZone());
        dto.setLibelle(ligne.getLibelle());
        dto.setTerminusDepart(ligne.getTerminusDepart());
        dto.setTerminusArrivee(ligne.getTerminusArrivee());
        return dto;
    }

    public List<LigneResponseDto> getAllLignes() {
        return ligneRepository.findAll().stream().map(this::toDto).toList();
    }

    public LigneResponseDto getLigneById(Long id) {
        Ligne ligne = ligneRepository.findById(id).orElseThrow(() -> new RuntimeException("Ligne non trouvé"));
        return toDto(ligne);
    }

    public LigneResponseDto createLigne(LigneRequestDto ligneRequest) {
        Ligne ligne = toEntity(ligneRequest);
        ligneRepository.save(ligne);
        return getLigneById(ligne.getId());
    }

    public LigneResponseDto updateLigneById(Long id, LigneRequestDto ligneRequest) {
        Ligne ligne = ligneRepository.findById(id).orElseThrow(() -> new RuntimeException("Ligne non trouvé"));
        ligne.setCode(ligneRequest.getCode());
        ligne.setZone(ligneRequest.getZone());
        ligne.setLibelle(ligneRequest.getLibelle());
        ligne.setTerminusDepart(ligneRequest.getTerminusDepart());
        ligne.setTerminusArrivee(ligneRequest.getTerminusArrivee());
        ligneRepository.save(ligne);
        return getLigneById(id);
    }

    public LigneResponseDto deleteLigneById(Long id) {
        LigneResponseDto dto = getLigneById(id);
        ligneRepository.deleteById(id);
        return dto;
    }
}