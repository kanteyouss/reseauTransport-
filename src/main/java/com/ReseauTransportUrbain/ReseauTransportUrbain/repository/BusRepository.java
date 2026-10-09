package com.ReseauTransportUrbain.ReseauTransportUrbain.repository;

import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    @Query("SELECT e, j0, j1 FROM Bus e LEFT JOIN Ligne j0 ON e.ligneId = j0.id LEFT JOIN Conducteur j1 ON e.conducteurId = j1.id")
    List<Object[]> findAllWithRelations();

    @Query("SELECT e, j0, j1 FROM Bus e LEFT JOIN Ligne j0 ON e.ligneId = j0.id LEFT JOIN Conducteur j1 ON e.conducteurId = j1.id WHERE e.id = :id")
    List<Object[]> findByIdWithRelations(@Param("id") Long id);
}