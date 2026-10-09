package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class BusRequestDto implements RequestDto {
    private Long id;
    private String code;
    private Integer capacite;
    private String depot;
    private Long ligneId;
    private Long conducteurId;

    public BusRequestDto() {
    }

    public BusRequestDto(Long id, String code, Integer capacite, String depot, Long ligneId, Long conducteurId) {
        this.id = id;
        this.code = code;
        this.capacite = capacite;
        this.depot = depot;
        this.ligneId = ligneId;
        this.conducteurId = conducteurId;
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

    public Long getLigneId() {
        return ligneId;
    }

    public void setLigneId(Long ligneId) {
        this.ligneId = ligneId;
    }

    public Long getConducteurId() {
        return conducteurId;
    }

    public void setConducteurId(Long conducteurId) {
        this.conducteurId = conducteurId;
    }
}