package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Représente Titre
 */
@Entity
@Table(name = "titre")
public class Titre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_achat", nullable = false)
    private LocalDateTime dateAchat;

    @Column(name = "voyages_restants")
    private Integer voyagesRestants;

    @Column(name = "type_titre_id")
    private Long typeTitreId;

    @Column(name = "voyageur_id")
    private Long voyageurId;

    public Titre() {
    }

    public Titre(Long id, LocalDateTime dateAchat, Integer voyagesRestants, Long typeTitreId, Long voyageurId) {
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