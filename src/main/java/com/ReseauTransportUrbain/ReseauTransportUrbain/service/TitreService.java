package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.TitreResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Titre;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.TitreRepository;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class TitreService {
    private final TitreRepository titreRepository;

    public TitreService(TitreRepository titreRepository) {
        this.titreRepository = titreRepository;
    }

    public TitreResponseDto toDto(Titre titre) {
        TitreResponseDto dto = new TitreResponseDto();
        dto.setId(titre.getId());
        dto.setDateAchat(titre.getDateAchat());
        dto.setVoyagesRestants(titre.getVoyagesRestants());
        dto.setTypeTitreId(titre.getTypeTitreId());
        dto.setVoyageurId(titre.getVoyageurId());
        return dto;
    }
}