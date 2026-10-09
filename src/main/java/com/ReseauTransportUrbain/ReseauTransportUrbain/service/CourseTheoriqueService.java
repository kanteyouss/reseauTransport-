package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseTheoriqueResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.CourseTheorique;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.CourseTheoriqueRepository;
import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class CourseTheoriqueService {
    private final CourseTheoriqueRepository courseTheoriqueRepository;

    public CourseTheoriqueService(CourseTheoriqueRepository courseTheoriqueRepository) {
        this.courseTheoriqueRepository = courseTheoriqueRepository;
    }

    public CourseTheoriqueResponseDto toDto(CourseTheorique courseTheorique) {
        CourseTheoriqueResponseDto dto = new CourseTheoriqueResponseDto();
        dto.setId(courseTheorique.getId());
        dto.setHeureDepartInitiale(courseTheorique.getHeureDepartInitiale());
        dto.setHeureFin(courseTheorique.getHeureFin());
        dto.setTypeJourId(courseTheorique.getTypeJourId());
        return dto;
    }
}