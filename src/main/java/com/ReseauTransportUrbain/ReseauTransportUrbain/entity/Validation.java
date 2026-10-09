package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Représente Validation
 */
@Entity
@Table(name = "validation")
public class Validation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_heure", nullable = false)
    private LocalDateTime dateHeure;

    @Column(name = "titre_id")
    private Long titreId;

    @Column(name = "course_reelle_id")
    private Long courseReelleId;

    public Validation() {
    }

    public Validation(Long id, LocalDateTime dateHeure, Long titreId, Long courseReelleId) {
        this.id = id;
        this.dateHeure = dateHeure;
        this.titreId = titreId;
        this.courseReelleId = courseReelleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public Long getTitreId() {
        return titreId;
    }

    public void setTitreId(Long titreId) {
        this.titreId = titreId;
    }

    public Long getCourseReelleId() {
        return courseReelleId;
    }

    public void setCourseReelleId(Long courseReelleId) {
        this.courseReelleId = courseReelleId;
    }
}