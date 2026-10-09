package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente LigneArret
 */
@Entity
@Table(name = "lignearret")
public class LigneArret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer ordre;

    @Column(name = "ligne_id")
    private Long ligneId;

    @Column(name = "arret_id")
    private Long arretId;

    public LigneArret() {
    }

    public LigneArret(Long id, Integer ordre, Long ligneId, Long arretId) {
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