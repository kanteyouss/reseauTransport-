package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

/**
 * Représente HoraireTheorique
 */
@Entity
@Table(name = "horairetheorique")
public class HoraireTheorique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "heure_passage_prevue", nullable = false)
    private LocalTime heurePassagePrevue;

    @Column(name = "course_theorique_id")
    private Long courseTheoriqueId;

    @Column(name = "ligne_arret_id")
    private Long ligneArretId;

    public HoraireTheorique() {
    }

    public HoraireTheorique(Long id, LocalTime heurePassagePrevue, Long courseTheoriqueId, Long ligneArretId) {
        this.id = id;
        this.heurePassagePrevue = heurePassagePrevue;
        this.courseTheoriqueId = courseTheoriqueId;
        this.ligneArretId = ligneArretId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHeurePassagePrevue() {
        return heurePassagePrevue;
    }

    public void setHeurePassagePrevue(LocalTime heurePassagePrevue) {
        this.heurePassagePrevue = heurePassagePrevue;
    }

    public Long getCourseTheoriqueId() {
        return courseTheoriqueId;
    }

    public void setCourseTheoriqueId(Long courseTheoriqueId) {
        this.courseTheoriqueId = courseTheoriqueId;
    }

    public Long getLigneArretId() {
        return ligneArretId;
    }

    public void setLigneArretId(Long ligneArretId) {
        this.ligneArretId = ligneArretId;
    }
}