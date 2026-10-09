package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalDateTime;

public class ValidationResponseDto {
    private Long id;
    private LocalDateTime dateHeure;
    private Long titreId;
    private Long courseReelleId;

    public ValidationResponseDto() {
    }

    public ValidationResponseDto(Long id, LocalDateTime dateHeure, Long titreId, Long courseReelleId) {
        this.id = id;
        this.dateHeure = dateHeure;
        this.titreId = titreId;
        this.courseReelleId = courseReelleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public Long getTitreId() {
        return titreId;
    }

    public void setTitreId(Long titreId) {
        this.titreId = titreId;
    }

    public Long getCourseReelleId() {
        return courseReelleId;
    }

    public void setCourseReelleId(Long courseReelleId) {
        this.courseReelleId = courseReelleId;
    }
}