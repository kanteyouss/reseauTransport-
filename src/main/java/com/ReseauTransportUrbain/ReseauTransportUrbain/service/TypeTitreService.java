package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.TypeTitreResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.TypeTitre;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.TypeTitreRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeTitreService {
    private final TypeTitreRepository typeTitreRepository;

    public TypeTitreService(TypeTitreRepository typeTitreRepository) {
        this.typeTitreRepository = typeTitreRepository;
    }

    public TypeTitreResponseDto toDto(TypeTitre typeTitre) {
        TypeTitreResponseDto dto = new TypeTitreResponseDto();
        dto.setId(typeTitre.getId());
        dto.setLibelle(typeTitre.getLibelle());
        dto.setTypeGestion(typeTitre.getTypeGestion());
        return dto;
    }
}