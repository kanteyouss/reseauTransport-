package com.ReseauTransportUrbain.ReseauTransportUrbain.repository;

import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Parcour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcourRepository extends JpaRepository<Parcour, Long> {
}