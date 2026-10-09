package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente Ligne
 */
@Entity
@Table(name = "ligne")
public class Ligne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String code;

    @Column(length = 50, nullable = false)
    private String zone;

    @Column(length = 100)
    private String libelle;

    @Column(name = "terminus_depart", length = 100)
    private String terminusDepart;

    @Column(name = "terminus_arrivee", length = 100)
    private String terminusArrivee;

    public Ligne() {
    }

    public Ligne(Long id, String code, String zone, String libelle, String terminusDepart, String terminusArrivee) {
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