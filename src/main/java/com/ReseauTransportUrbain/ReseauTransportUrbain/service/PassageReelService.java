package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.PassageReelResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.PassageReel;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.PassageReelRepository;
import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class PassageReelService {
    private final PassageReelRepository passageReelRepository;

    public PassageReelService(PassageReelRepository passageReelRepository) {
        this.passageReelRepository = passageReelRepository;
    }

    public PassageReelResponseDto toDto(PassageReel passageReel) {
        PassageReelResponseDto dto = new PassageReelResponseDto();
        dto.setId(passageReel.getId());
        dto.setHeurePassageReelle(passageReel.getHeurePassageReelle());
        dto.setCourseReelleId(passageReel.getCourseReelleId());
        dto.setLigneArretId(passageReel.getLigneArretId());
        return dto;
    }
}