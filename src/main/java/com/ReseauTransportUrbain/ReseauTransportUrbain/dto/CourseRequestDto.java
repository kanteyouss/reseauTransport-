package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalDateTime;

public class CourseRequestDto implements RequestDto {
    private Long id;
    private LocalDateTime heureDepart;
    private LocalDateTime heureFin;
    private String statut;

    public CourseRequestDto() {
    }

    public CourseRequestDto(Long id, LocalDateTime heureDepart, LocalDateTime heureFin, String statut) {
        this.id = id;
        this.heureDepart = heureDepart;
        this.heureFin = heureFin;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDateTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalDateTime heureFin) {
        this.heureFin = heureFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}