package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalTime;

public class PassageReelResponseDto {
    private Long id;
    private LocalTime heurePassageReelle;
    private Long courseReelleId;
    private Long ligneArretId;

    public PassageReelResponseDto() {
    }

    public PassageReelResponseDto(Long id, LocalTime heurePassageReelle, Long courseReelleId, Long ligneArretId) {
        this.id = id;
        this.heurePassageReelle = heurePassageReelle;
        this.courseReelleId = courseReelleId;
        this.ligneArretId = ligneArretId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeurePassageReelle() {
        return heurePassageReelle;
    }

    public void setHeurePassageReelle(LocalTime heurePassageReelle) {
        this.heurePassageReelle = heurePassageReelle;
    }

    public Long getCourseReelleId() {
        return courseReelleId;
    }

    public void setCourseReelleId(Long courseReelleId) {
        this.courseReelleId = courseReelleId;
    }

    public Long getLigneArretId() {
        return ligneArretId;
    }

    public void setLigneArretId(Long ligneArretId) {
        this.ligneArretId = ligneArretId;
    }
}