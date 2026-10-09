package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.HoraireTheoriqueResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.HoraireTheorique;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.HoraireTheoriqueRepository;
import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class HoraireTheoriqueService {
    private final HoraireTheoriqueRepository horaireTheoriqueRepository;

    public HoraireTheoriqueService(HoraireTheoriqueRepository horaireTheoriqueRepository) {
        this.horaireTheoriqueRepository = horaireTheoriqueRepository;
    }

    public HoraireTheoriqueResponseDto toDto(HoraireTheorique horaireTheorique) {
        HoraireTheoriqueResponseDto dto = new HoraireTheoriqueResponseDto();
        dto.setId(horaireTheorique.getId());
        dto.setHeurePassagePrevue(horaireTheorique.getHeurePassagePrevue());
        dto.setCourseTheoriqueId(horaireTheorique.getCourseTheoriqueId());
        dto.setLigneArretId(horaireTheorique.getLigneArretId());
        return dto;
    }
}