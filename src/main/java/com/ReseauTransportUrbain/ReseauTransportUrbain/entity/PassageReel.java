package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

/**
 * Représente PassageReel
 */
@Entity
@Table(name = "passagereel")
public class PassageReel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "heure_passage_reelle", nullable = false)
    private LocalTime heurePassageReelle;

    @Column(name = "course_reelle_id")
    private Long courseReelleId;

    @Column(name = "ligne_arret_id")
    private Long ligneArretId;

    public PassageReel() {
    }

    public PassageReel(Long id, LocalTime heurePassageReelle, Long courseReelleId, Long ligneArretId) {
        this.id = id;
        this.heurePassageReelle = heurePassageReelle;
        this.courseReelleId = courseReelleId;
        this.ligneArretId = ligneArretId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeurePassageReelle() {
        return heurePassageReelle;
    }

    public void setHeurePassageReelle(LocalTime heurePassageReelle) {
        this.heurePassageReelle = heurePassageReelle;
    }

    public Long getCourseReelleId() {
        return courseReelleId;
    }

    public void setCourseReelleId(Long courseReelleId) {
        this.courseReelleId = courseReelleId;
    }

    public Long getLigneArretId() {
        return ligneArretId;
    }

    public void setLigneArretId(Long ligneArretId) {
        this.ligneArretId = ligneArretId;
    }
}