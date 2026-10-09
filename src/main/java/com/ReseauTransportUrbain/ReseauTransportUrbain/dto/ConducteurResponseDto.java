package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class ConducteurResponseDto implements ResponseDto {
    private Long id;
    private String nom;
    private String matricule;
    private String numeroPermis;

    public ConducteurResponseDto() {
    }

    public ConducteurResponseDto(Long id, String nom, String matricule, String numeroPermis) {
        this.id = id;
        this.nom = nom;
        this.matricule = matricule;
        this.numeroPermis = numeroPermis;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}