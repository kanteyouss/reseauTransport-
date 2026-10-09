package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ArretResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.RequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Arret;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ArretRepository;
import org.springframework.stereotype.Service;

/**
 * Service métier gérant les Arrets.
 * Fournit les opérations CRUD et les conversions entité/DTO.
 * La lecture (getAll, getById) et la suppression sont héritées
 * de {@link AbstractCrudService}.
 */
@Service
public class ArretService extends AbstractCrudService {
    private final ArretRepository arretRepository;

    /**
     * Constructeur injectant le repository des arrets.
     *
     * @param arretRepository le repository des arrets
     */
    public ArretService(ArretRepository arretRepository) {
        super(arretRepository);
        this.arretRepository = arretRepository;
    }

    /**
     * Construit une entité Arret à partir des données de la requête.
     *
     * @param arretRequest Les données de la requête (ArretRequestDto)
     * @return L'entité Arret construite
     */
    public Arret toEntity(ArretRequestDto arretRequest) {
        Arret arret = new Arret();
        arret.setNom(arretRequest.getNom());
        arret.setCommune(arretRequest.getCommune());
        arret.setLatitude(arretRequest.getLatitude());
        arret.setLongitude(arretRequest.getLongitude());
        return arret;
    }

    /**
     * Convertit une entité Arret en DTO de réponse.
     *
     * @param entity L'entité Arret à convertir
     * @return L'objet ResponseDto correspondant
     */
    @Override
    public ResponseDto toDto(Object entity) {
        Arret arret = (Arret) entity;
        ArretResponseDto dto = new ArretResponseDto();
        dto.setId(arret.getId());
        dto.setNom(arret.getNom());
        dto.setCommune(arret.getCommune());
        dto.setLatitude(arret.getLatitude());
        dto.setLongitude(arret.getLongitude());
        return dto;
    }

    /**
     * Crée une nouvelle entité Arret à partir des données fournies.
     *
     * @param request Les données de la requête (ArretRequestDto)
     * @return L'objet ResponseDto correspondant à l'arret créé
     */
    @Override
    public ResponseDto create(RequestDto request) {
        ArretRequestDto arretRequest = (ArretRequestDto) request;
        return toDto(arretRepository.save(toEntity(arretRequest)));
    }

    /**
     * Met à jour l'entité Arret existante à partir des données fournies.
     *
     * @param id L'identifiant de l'entité Arret à modifier
     * @param request Les données de la requête (ArretRequestDto)
     * @return L'objet ResponseDto correspondant à l'arret modifié
     * @throws RuntimeException Si l'entité Arret n'existe pas
     */
    @Override
    public ResponseDto update(Long id, RequestDto request) {
        ArretRequestDto arretRequest = (ArretRequestDto) request;
        Arret arret = arretRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Arret non trouvé"));
        arret.setNom(arretRequest.getNom());
        arret.setCommune(arretRequest.getCommune());
        arret.setLatitude(arretRequest.getLatitude());
        arret.setLongitude(arretRequest.getLongitude());
        return toDto(arretRepository.save(arret));
    }
}
