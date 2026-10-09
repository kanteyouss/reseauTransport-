package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente TypeProfil
 */
@Entity
@Table(name = "typeprofil")
public class TypeProfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String libelle;

    public TypeProfil() {
    }

    public TypeProfil(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
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
}