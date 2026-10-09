package com.ReseauTransportUrbain.ReseauTransportUrbain.repository;

import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.TypeProfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProfilRepository extends JpaRepository<TypeProfil, Long> {
}