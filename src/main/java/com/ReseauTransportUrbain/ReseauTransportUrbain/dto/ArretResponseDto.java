package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.math.BigDecimal;

public class ArretResponseDto {
    private Long id;
    private String nom;
    private String commune;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public ArretResponseDto() {
    }

    public ArretResponseDto(Long id, String nom, String commune, BigDecimal latitude, BigDecimal longitude) {
        this.id = id;
        this.nom = nom;
        this.commune = commune;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}