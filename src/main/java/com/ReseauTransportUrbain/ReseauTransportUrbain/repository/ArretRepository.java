package com.ReseauTransportUrbain.ReseauTransportUrbain.repository;

import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Arret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArretRepository extends JpaRepository<Arret, Long> {
}