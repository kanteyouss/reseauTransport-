package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class BusResponseDto {
    private Long id;
    private String code;
    private Integer capacite;
    private String depot;
    private LigneResponseDto ligne;
    private ConducteurResponseDto conducteur;

    public BusResponseDto() {
    }

    public BusResponseDto(Long id, String code, Integer capacite, String depot, LigneResponseDto ligne, ConducteurResponseDto conducteur) {
        this.id = id;
        this.code = code;
        this.capacite = capacite;
        this.depot = depot;
        this.ligne = ligne;
        this.conducteur = conducteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public LigneResponseDto getLigne() {
        return ligne;
    }

    public void setLigne(LigneResponseDto ligne) {
        this.ligne = ligne;
    }

    public ConducteurResponseDto getConducteur() {
        return conducteur;
    }

    public void setConducteur(ConducteurResponseDto conducteur) {
        this.conducteur = conducteur;
    }
}