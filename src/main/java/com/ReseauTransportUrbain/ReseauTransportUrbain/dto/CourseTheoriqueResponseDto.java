package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalTime;

public class CourseTheoriqueResponseDto {
    private Long id;
    private LocalTime heureDepartInitiale;
    private LocalTime heureFin;
    private Long typeJourId;

    public CourseTheoriqueResponseDto() {
    }

    public CourseTheoriqueResponseDto(Long id, LocalTime heureDepartInitiale, LocalTime heureFin, Long typeJourId) {
        this.id = id;
        this.heureDepartInitiale = heureDepartInitiale;
        this.heureFin = heureFin;
        this.typeJourId = typeJourId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeureDepartInitiale() {
        return heureDepartInitiale;
    }

    public void setHeureDepartInitiale(LocalTime heureDepartInitiale) {
        this.heureDepartInitiale = heureDepartInitiale;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public Long getTypeJourId() {
        return typeJourId;
    }

    public void setTypeJourId(Long typeJourId) {
        this.typeJourId = typeJourId;
    }
}