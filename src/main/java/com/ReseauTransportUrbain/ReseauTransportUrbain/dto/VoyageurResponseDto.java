package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class VoyageurResponseDto {
    private Long id;
    private String nom;

    public VoyageurResponseDto() {
    }

    public VoyageurResponseDto(Long id, String nom) {
        this.id = id;
        this.nom = nom;
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
}