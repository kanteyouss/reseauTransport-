package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente TypeTitre
 */
@Entity
@Table(name = "type_titre")
public class TypeTitre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String libelle;

    @Column(name = "type_gestion", length = 50, nullable = false)
    private String typeGestion;

    public TypeTitre() {
    }

    public TypeTitre(Long id, String libelle, String typeGestion) {
        this.id = id;
        this.libelle = libelle;
        this.typeGestion = typeGestion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTypeGestion() {
        return typeGestion;
    }

    public void setTypeGestion(String typeGestion) {
        this.typeGestion = typeGestion;
    }
}