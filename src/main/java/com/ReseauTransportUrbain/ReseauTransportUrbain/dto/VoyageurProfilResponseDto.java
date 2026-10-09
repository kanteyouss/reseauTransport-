package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalDate;

public class VoyageurProfilResponseDto {
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateExpiration;
    private Long voyageurId;
    private Long typeProfilId;

    public VoyageurProfilResponseDto() {
    }

    public VoyageurProfilResponseDto(Long id, LocalDate dateDebut, LocalDate dateExpiration, Long voyageurId, Long typeProfilId) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateExpiration = dateExpiration;
        this.voyageurId = voyageurId;
        this.typeProfilId = typeProfilId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Long getVoyageurId() {
        return voyageurId;
    }

    public void setVoyageurId(Long voyageurId) {
        this.voyageurId = voyageurId;
    }

    public Long getTypeProfilId() {
        return typeProfilId;
    }

    public void setTypeProfilId(Long typeProfilId) {
        this.typeProfilId = typeProfilId;
    }
}