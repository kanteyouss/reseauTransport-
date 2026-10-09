package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ValidationResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Validation;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ValidationRepository;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    private final ValidationRepository validationRepository;

    public ValidationService(ValidationRepository validationRepository) {
        this.validationRepository = validationRepository;
    }

    public ValidationResponseDto toDto(Validation validation) {
        ValidationResponseDto dto = new ValidationResponseDto();
        dto.setId(validation.getId());
        dto.setDateHeure(validation.getDateHeure());
        dto.setTitreId(validation.getTitreId());
        dto.setCourseReelleId(validation.getCourseReelleId());
        return dto;
    }
}