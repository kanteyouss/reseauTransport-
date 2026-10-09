package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente LigneParcour
 */
@Entity
@Table(name = "ligneparcour")
public class LigneParcour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String ic;

    @Column(name = "ligne_id")
    private Long ligneId;

    @Column(name = "parcour_id")
    private Long parcourId;

    public LigneParcour() {
    }

    public LigneParcour(Long id, String ic, Long ligneId, Long parcourId) {
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