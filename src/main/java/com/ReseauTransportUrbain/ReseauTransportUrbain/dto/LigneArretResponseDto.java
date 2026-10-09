package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class LigneArretResponseDto {
    private Long id;
    private Integer ordre;
    private Long ligneId;
    private Long arretId;

    public LigneArretResponseDto() {
    }

    public LigneArretResponseDto(Long id, Integer ordre, Long ligneId, Long arretId) {
        this.id = id;
        this.ordre = ordre;
        this.ligneId = ligneId;
        this.arretId = arretId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Long getLigneId() {
        return ligneId;
    }

    public void setLigneId(Long ligneId) {
        this.ligneId = ligneId;
    }

    public Long getArretId() {
        return arretId;
    }

    public void setArretId(Long arretId) {
        this.arretId = arretId;
    }
}