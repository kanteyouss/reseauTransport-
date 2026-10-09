package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.TypeJourResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.TypeJour;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.TypeJourRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeJourService {
    private final TypeJourRepository typeJourRepository;

    public TypeJourService(TypeJourRepository typeJourRepository) {
        this.typeJourRepository = typeJourRepository;
    }

    public TypeJourResponseDto toDto(TypeJour typeJour) {
        TypeJourResponseDto dto = new TypeJourResponseDto();
        dto.setId(typeJour.getId());
        dto.setLibelle(typeJour.getLibelle());
        return dto;
    }
}