package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ParcourResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Parcour;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ParcourRepository;
import org.springframework.stereotype.Service;

@Service
public class ParcourService {
    private final ParcourRepository parcourRepository;

    public ParcourService(ParcourRepository parcourRepository) {
        this.parcourRepository = parcourRepository;
    }

    public ParcourResponseDto toDto(Parcour parcour) {
        ParcourResponseDto dto = new ParcourResponseDto();
        dto.setId(parcour.getId());
        dto.setLibelle(parcour.getLibelle());
        return dto;
    }
}