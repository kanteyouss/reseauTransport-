package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class TypeProfilResponseDto {
    private Long id;
    private String libelle;

    public TypeProfilResponseDto() {
    }

    public TypeProfilResponseDto(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}