package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Arret;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ArretRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArretService {
    private final ArretRepository arretRepository;

    public ArretService(ArretRepository arretRepository) {
        this.arretRepository = arretRepository;
    }

    public Arret toEntity(ArretRequestDto arretRequest) {
        Arret arret = new Arret();
        arret.setNom(arretRequest.getNom());
        arret.setCommune(arretRequest.getCommune());
        arret.setLatitude(arretRequest.getLatitude());
        arret.setLongitude(arretRequest.getLongitude());
        return arret;
    }

    public ArretResponseDto toDto(Arret arret) {
        ArretResponseDto dto = new ArretResponseDto();
        dto.setId(arret.getId());
        dto.setNom(arret.getNom());
        dto.setCommune(arret.getCommune());
        dto.setLatitude(arret.getLatitude());
        dto.setLongitude(arret.getLongitude());
        return dto;
    }

    public List<ArretResponseDto> getAllArrets() {
        return arretRepository.findAll().stream().map(this::toDto).toList();
    }

    public ArretResponseDto getArretById(Long id) {
        Arret arret = arretRepository.findById(id).orElseThrow(() -> new RuntimeException("Arret non trouvé"));
        return toDto(arret);
    }

    public ArretResponseDto createArret(ArretRequestDto arretRequest) {
        Arret arret = toEntity(arretRequest);
        arretRepository.save(arret);
        return getArretById(arret.getId());
    }

    public ArretResponseDto updateArretById(Long id, ArretRequestDto arretRequest) {
        Arret arret = arretRepository.findById(id).orElseThrow(() -> new RuntimeException("Arret non trouvé"));
        arret.setNom(arretRequest.getNom());
        arret.setCommune(arretRequest.getCommune());
        arret.setLatitude(arretRequest.getLatitude());
        arret.setLongitude(arretRequest.getLongitude());
        arretRepository.save(arret);
        return getArretById(id);
    }

    public ArretResponseDto deleteArretById(Long id) {
        ArretResponseDto dto = getArretById(id);
        arretRepository.deleteById(id);
        return dto;
    }
}