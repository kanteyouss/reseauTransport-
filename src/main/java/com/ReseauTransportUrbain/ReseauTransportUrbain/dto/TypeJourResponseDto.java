package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class TypeJourResponseDto {
    private Long id;
    private String libelle;

    public TypeJourResponseDto() {
    }

    public TypeJourResponseDto(Long id, String libelle) {
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