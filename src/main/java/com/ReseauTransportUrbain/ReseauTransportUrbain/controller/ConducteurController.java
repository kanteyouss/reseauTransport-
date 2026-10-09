package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.service.ConducteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conducteurs")
public class ConducteurController {
    private final ConducteurService conducteurService;

    public ConducteurController(ConducteurService conducteurService) {
        this.conducteurService = conducteurService;
    }

    @GetMapping
    public List<ConducteurResponseDto> getAllConducteurs() {
        return conducteurService.getAllConducteurs();
    }

    @GetMapping("/{id}")
    public ConducteurResponseDto getConducteurById(@PathVariable Long id) {
        return conducteurService.getConducteurById(id);
    }

    @PostMapping
    public ConducteurResponseDto createConducteur(@RequestBody ConducteurRequestDto conducteurRequest) {
        return conducteurService.createConducteur(conducteurRequest);
    }

    @PutMapping("/{id}")
    public ConducteurResponseDto updateConducteurById(@PathVariable Long id, @RequestBody ConducteurRequestDto conducteurRequest) {
        return conducteurService.updateConducteurById(id, conducteurRequest);
    }

    @DeleteMapping("/{id}")
    public ConducteurResponseDto deleteConducteurById(@PathVariable Long id) {
        return conducteurService.deleteConducteurById(id);
    }
}