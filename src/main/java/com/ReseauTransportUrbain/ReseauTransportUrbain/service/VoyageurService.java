package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.VoyageurResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Voyageur;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.VoyageurRepository;
import org.springframework.stereotype.Service;

@Service
public class VoyageurService {
    private final VoyageurRepository voyageurRepository;

    public VoyageurService(VoyageurRepository voyageurRepository) {
        this.voyageurRepository = voyageurRepository;
    }

    public VoyageurResponseDto toDto(Voyageur voyageur) {
        VoyageurResponseDto dto = new VoyageurResponseDto();
        dto.setId(voyageur.getId());
        dto.setNom(voyageur.getNom());
        return dto;
    }
}