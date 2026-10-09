package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

/**
 * Représente CourseTheorique
 */
@Entity
@Table(name = "coursetheorique")
public class CourseTheorique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "heure_depart_initiale", nullable = false)
    private LocalTime heureDepartInitiale;

    @Column(name = "heure_fin", nullable = false)
    private LocalTime heureFin;

    @Column(name = "type_jour_id")
    private Long typeJourId;

    public CourseTheorique() {
    }

    public CourseTheorique(Long id, LocalTime heureDepartInitiale, LocalTime heureFin, Long typeJourId) {
        this.id = id;
        this.heureDepartInitiale = heureDepartInitiale;
        this.heureFin = heureFin;
        this.typeJourId = typeJourId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeureDepartInitiale() {
        return heureDepartInitiale;
    }

    public void setHeureDepartInitiale(LocalTime heureDepartInitiale) {
        this.heureDepartInitiale = heureDepartInitiale;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public Long getTypeJourId() {
        return typeJourId;
    }

    public void setTypeJourId(Long typeJourId) {
        this.typeJourId = typeJourId;
    }
}