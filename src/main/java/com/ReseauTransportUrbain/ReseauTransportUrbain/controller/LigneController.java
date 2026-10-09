package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.service.LigneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lignes")
public class LigneController {
    private final LigneService ligneService;

    public LigneController(LigneService ligneService) {
        this.ligneService = ligneService;
    }

    @GetMapping
    public List<LigneResponseDto> getAllLignes() {
        return ligneService.getAllLignes();
    }

    @GetMapping("/{id}")
    public LigneResponseDto getLigneById(@PathVariable Long id) {
        return ligneService.getLigneById(id);
    }

    @PostMapping
    public LigneResponseDto createLigne(@RequestBody LigneRequestDto ligneRequest) {
        return ligneService.createLigne(ligneRequest);
    }

    @PutMapping("/{id}")
    public LigneResponseDto updateLigneById(@PathVariable Long id, @RequestBody LigneRequestDto ligneRequest) {
        return ligneService.updateLigneById(id, ligneRequest);
    }

    @DeleteMapping("/{id}")
    public LigneResponseDto deleteLigneById(@PathVariable Long id) {
        return ligneService.deleteLigneById(id);
    }
}