package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class TypeTitreResponseDto {
    private Long id;
    private String libelle;
    private String typeGestion;

    public TypeTitreResponseDto() {
    }

    public TypeTitreResponseDto(Long id, String libelle, String typeGestion) {
        this.id = id;
        this.libelle = libelle;
        this.typeGestion = typeGestion;
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

    public String getTypeGestion() {
        return typeGestion;
    }

    public void setTypeGestion(String typeGestion) {
        this.typeGestion = typeGestion;
    }
}