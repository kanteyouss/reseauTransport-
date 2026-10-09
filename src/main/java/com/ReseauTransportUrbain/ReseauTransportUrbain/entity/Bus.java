package com.ReseauTransportUrbain.ReseauTransportUrbain.entity;

import jakarta.persistence.*;

/**
 * Représente Bus
 */
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String code;

    private Integer capacite;

    @Column(length = 100)
    private String depot;

    @Column(name = "ligne_id")
    private Long ligneId;

    @Column(name = "conducteur_id")
    private Long conducteurId;

    public Bus() {
    }

    public Bus(Long id, String code, Integer capacite, String depot, Long ligneId, Long conducteurId) {
        this.id = id;
        this.code = code;
        this.capacite = capacite;
        this.depot = depot;
        this.ligneId = ligneId;
        this.conducteurId = conducteurId;
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

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public Long getLigneId() {
        return ligneId;
    }

    public void setLigneId(Long ligneId) {
        this.ligneId = ligneId;
    }

    public Long getConducteurId() {
        return conducteurId;
    }

    public void setConducteurId(Long conducteurId) {
        this.conducteurId = conducteurId;
    }
}