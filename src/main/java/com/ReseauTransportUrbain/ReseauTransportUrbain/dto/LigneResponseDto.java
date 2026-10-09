package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class LigneResponseDto {
    private Long id;
    private String code;
    private String zone;
    private String libelle;
    private String terminusDepart;
    private String terminusArrivee;

    public LigneResponseDto() {
    }

    public LigneResponseDto(Long id, String code, String zone, String libelle, String terminusDepart, String terminusArrivee) {
        this.id = id;
        this.code = code;
        this.zone = zone;
        this.libelle = libelle;
        this.terminusDepart = terminusDepart;
        this.terminusArrivee = terminusArrivee;
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTerminusDepart() {
        return terminusDepart;
    }

    public void setTerminusDepart(String terminusDepart) {
        this.terminusDepart = terminusDepart;
    }

    public String getTerminusArrivee() {
        return terminusArrivee;
    }

    public void setTerminusArrivee(String terminusArrivee) {
        this.terminusArrivee = terminusArrivee;
    }
}