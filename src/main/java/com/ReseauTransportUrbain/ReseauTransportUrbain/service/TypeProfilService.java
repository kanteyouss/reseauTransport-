package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.TypeProfilResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.TypeProfil;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.TypeProfilRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeProfilService {
    private final TypeProfilRepository typeProfilRepository;

    public TypeProfilService(TypeProfilRepository typeProfilRepository) {
        this.typeProfilRepository = typeProfilRepository;
    }

    public TypeProfilResponseDto toDto(TypeProfil typeProfil) {
        TypeProfilResponseDto dto = new TypeProfilResponseDto();
        dto.setId(typeProfil.getId());
        dto.setLibelle(typeProfil.getLibelle());
        return dto;
    }
}