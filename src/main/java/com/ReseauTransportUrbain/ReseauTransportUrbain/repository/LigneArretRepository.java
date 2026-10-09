package com.ReseauTransportUrbain.ReseauTransportUrbain.repository;

import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.LigneArret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneArretRepository extends JpaRepository<LigneArret, Long> {
}