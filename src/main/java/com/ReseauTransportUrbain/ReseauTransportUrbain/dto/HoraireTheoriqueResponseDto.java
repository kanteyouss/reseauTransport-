package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalTime;

public class HoraireTheoriqueResponseDto {
    private Long id;
    private LocalTime heurePassagePrevue;
    private Long courseTheoriqueId;
    private Long ligneArretId;

    public HoraireTheoriqueResponseDto() {
    }

    public HoraireTheoriqueResponseDto(Long id, LocalTime heurePassagePrevue, Long courseTheoriqueId, Long ligneArretId) {
        this.id = id;
        this.heurePassagePrevue = heurePassagePrevue;
        this.courseTheoriqueId = courseTheoriqueId;
        this.ligneArretId = ligneArretId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeurePassagePrevue() {
        return heurePassagePrevue;
    }

    public void setHeurePassagePrevue(LocalTime heurePassagePrevue) {
        this.heurePassagePrevue = heurePassagePrevue;
    }

    public Long getCourseTheoriqueId() {
        return courseTheoriqueId;
    }

    public void setCourseTheoriqueId(Long courseTheoriqueId) {
        this.courseTheoriqueId = courseTheoriqueId;
    }

    public Long getLigneArretId() {
        return ligneArretId;
    }

    public void setLigneArretId(Long ligneArretId) {
        this.ligneArretId = ligneArretId;
    }
}