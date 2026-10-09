package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

public class LigneParcourResponseDto {
    private Long id;
    private String ic;
    private Long ligneId;
    private Long parcourId;

    public LigneParcourResponseDto() {
    }

    public LigneParcourResponseDto(Long id, String ic, Long ligneId, Long parcourId) {
        this.id = id;
        this.ic = ic;
        this.ligneId = ligneId;
        this.parcourId = parcourId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public Long getLigneId() {
        return ligneId;
    }

    public void setLigneId(Long ligneId) {
        this.ligneId = ligneId;
    }

    public Long getParcourId() {
        return parcourId;
    }

    public void setParcourId(Long parcourId) {
        this.parcourId = parcourId;
    }
}