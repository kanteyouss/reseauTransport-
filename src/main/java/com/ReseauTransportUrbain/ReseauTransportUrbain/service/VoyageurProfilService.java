package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.VoyageurProfilResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.VoyageurProfil;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.VoyageurProfilRepository;
import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service
public class VoyageurProfilService {
    private final VoyageurProfilRepository voyageurProfilRepository;

    public VoyageurProfilService(VoyageurProfilRepository voyageurProfilRepository) {
        this.voyageurProfilRepository = voyageurProfilRepository;
    }

    public VoyageurProfilResponseDto toDto(VoyageurProfil voyageurProfil) {
        VoyageurProfilResponseDto dto = new VoyageurProfilResponseDto();
        dto.setId(voyageurProfil.getId());
        dto.setDateDebut(voyageurProfil.getDateDebut());
        dto.setDateExpiration(voyageurProfil.getDateExpiration());
        dto.setVoyageurId(voyageurProfil.getVoyageurId());
        dto.setTypeProfilId(voyageurProfil.getTypeProfilId());
        return dto;
    }
}