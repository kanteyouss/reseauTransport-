package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneArretResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.LigneArret;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.LigneArretRepository;
import org.springframework.stereotype.Service;

@Service
public class LigneArretService {
    private final LigneArretRepository ligneArretRepository;

    public LigneArretService(LigneArretRepository ligneArretRepository) {
        this.ligneArretRepository = ligneArretRepository;
    }

    public LigneArretResponseDto toDto(LigneArret ligneArret) {
        LigneArretResponseDto dto = new LigneArretResponseDto();
        dto.setId(ligneArret.getId());
        dto.setOrdre(ligneArret.getOrdre());
        dto.setLigneId(ligneArret.getLigneId());
        dto.setArretId(ligneArret.getArretId());
        return dto;
    }
}