package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.service.ArretService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arrets")
public class ArretController {
    private final ArretService arretService;

    public ArretController(ArretService arretService) {
        this.arretService = arretService;
    }

    @GetMapping
    public List<ArretResponseDto> getAllArrets() {
        return arretService.getAllArrets();
    }

    @GetMapping("/{id}")
    public ArretResponseDto getArretById(@PathVariable Long id) {
        return arretService.getArretById(id);
    }

    @PostMapping
    public ArretResponseDto createArret(@RequestBody ArretRequestDto arretRequest) {
        return arretService.createArret(arretRequest);
    }

    @PutMapping("/{id}")
    public ArretResponseDto updateArretById(@PathVariable Long id, @RequestBody ArretRequestDto arretRequest) {
        return arretService.updateArretById(id, arretRequest);
    }

    @DeleteMapping("/{id}")
    public ArretResponseDto deleteArretById(@PathVariable Long id) {
        return arretService.deleteArretById(id);
    }
}