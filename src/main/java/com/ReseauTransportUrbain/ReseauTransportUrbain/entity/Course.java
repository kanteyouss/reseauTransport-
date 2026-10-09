package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Représente Course
 */
@Entity
@Table(name = "coursereelle")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "heure_depart", nullable = false)
    private LocalDateTime heureDepart;

    @Column(name = "heure_fin", nullable = false)
    private LocalDateTime heureFin;

    @Column(length = 50)
    private String statut;

    public Course() {
    }

    public Course(Long id, LocalDateTime heureDepart, LocalDateTime heureFin, String statut) {
        this.id = id;
        this.heureDepart = heureDepart;
        this.heureFin = heureFin;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDateTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalDateTime heureFin) {
        this.heureFin = heureFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}