package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Représente VoyageurProfil
 */
@Entity
@Table(name = "voyageurprofil")
public class VoyageurProfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_debut", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "date_expiration", nullable = false)
    private LocalDate dateExpiration;

    @Column(name = "voyageur_id")
    private Long voyageurId;

    @Column(name = "type_profil_id")
    private Long typeProfilId;

    public VoyageurProfil() {
    }

    public VoyageurProfil(Long id, LocalDate dateDebut, LocalDate dateExpiration, Long voyageurId, Long typeProfilId) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateExpiration = dateExpiration;
        this.voyageurId = voyageurId;
        this.typeProfilId = typeProfilId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Long getVoyageurId() {
        return voyageurId;
    }

    public void setVoyageurId(Long voyageurId) {
        this.voyageurId = voyageurId;
    }

    public Long getTypeProfilId() {
        return typeProfilId;
    }

    public void setTypeProfilId(Long typeProfilId) {
        this.typeProfilId = typeProfilId;
    }
}