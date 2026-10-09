package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneParcourResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.LigneParcour;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.LigneParcourRepository;
import org.springframework.stereotype.Service;

@Service
public class LigneParcourService {
    private final LigneParcourRepository ligneParcourRepository;

    public LigneParcourService(LigneParcourRepository ligneParcourRepository) {
        this.ligneParcourRepository = ligneParcourRepository;
    }

    public LigneParcourResponseDto toDto(LigneParcour ligneParcour) {
        LigneParcourResponseDto dto = new LigneParcourResponseDto();
        dto.setId(ligneParcour.getId());
        dto.setIc(ligneParcour.getIc());
        dto.setLigneId(ligneParcour.getLigneId());
        dto.setParcourId(ligneParcour.getParcourId());
        return dto;
    }
}