package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import java.time.LocalDateTime;

public class TitreResponseDto {
    private Long id;
    private LocalDateTime dateAchat;
    private Integer voyagesRestants;
    private Long typeTitreId;
    private Long voyageurId;

    public TitreResponseDto() {
    }

    public TitreResponseDto(Long id, LocalDateTime dateAchat, Integer voyagesRestants, Long typeTitreId, Long voyageurId) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.voyagesRestants = voyagesRestants;
        this.typeTitreId = typeTitreId;
        this.voyageurId = voyageurId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Integer getVoyagesRestants() {
        return voyagesRestants;
    }

    public void setVoyagesRestants(Integer voyagesRestants) {
        this.voyagesRestants = voyagesRestants;
    }

    public Long getTypeTitreId() {
        return typeTitreId;
    }

    public void setTypeTitreId(Long typeTitreId) {
        this.typeTitreId = typeTitreId;
    }

    public Long getVoyageurId() {
        return voyageurId;
    }

    public void setVoyageurId(Long voyageurId) {
        this.voyageurId = voyageurId;
    }
}