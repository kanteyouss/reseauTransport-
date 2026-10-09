package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente Conducteur
 */
@Entity
@Table(name = "conducteur")
public class Conducteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nom;

    @Column(length = 50, nullable = false, unique = true)
    private String matricule;

    @Column(name = "numero_permis", length = 50)
    private String numeroPermis;

    public Conducteur() {
    }

    public Conducteur(Long id, String nom, String matricule, String numeroPermis) {
        this.id = id;
        this.nom = nom;
        this.matricule = matricule;
        this.numeroPermis = numeroPermis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}