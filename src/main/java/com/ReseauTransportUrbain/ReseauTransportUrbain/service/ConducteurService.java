package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ConducteurResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.RequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Conducteur;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.ConducteurRepository;
import org.springframework.stereotype.Service;

/**
 * Service métier gérant les Conducteurs.
 * Fournit les opérations CRUD et les conversions entité/DTO.
 * La lecture (getAll, getById) et la suppression sont héritées
 * de {@link AbstractCrudService}.
 */
@Service
public class ConducteurService extends AbstractCrudService {
    private final ConducteurRepository conducteurRepository;

    /**
     * Constructeur injectant le repository des conducteurs.
     *
     * @param conducteurRepository le repository des conducteurs
     */
    public ConducteurService(ConducteurRepository conducteurRepository) {
        super(conducteurRepository);
        this.conducteurRepository = conducteurRepository;
    }

    /**
     * Construit une entité Conducteur à partir des données de la requête.
     *
     * @param conducteurRequest Les données de la requête (ConducteurRequestDto)
     * @return L'entité Conducteur construite
     */
    public Conducteur toEntity(ConducteurRequestDto conducteurRequest) {
        Conducteur conducteur = new Conducteur();
        conducteur.setNom(conducteurRequest.getNom());
        conducteur.setMatricule(conducteurRequest.getMatricule());
        conducteur.setNumeroPermis(conducteurRequest.getNumeroPermis());
        return conducteur;
    }

    /**
     * Convertit une entité Conducteur en DTO de réponse.
     *
     * @param entity L'entité Conducteur à convertir
     * @return L'objet ResponseDto correspondant
     */
    @Override
    public ResponseDto toDto(Object entity) {
        Conducteur conducteur = (Conducteur) entity;
        ConducteurResponseDto dto = new ConducteurResponseDto();
        dto.setId(conducteur.getId());
        dto.setNom(conducteur.getNom());
        dto.setMatricule(conducteur.getMatricule());
        dto.setNumeroPermis(conducteur.getNumeroPermis());
        return dto;
    }

    /**
     * Crée une nouvelle entité Conducteur à partir des données fournies.
     *
     * @param request Les données de la requête (ConducteurRequestDto)
     * @return L'objet ResponseDto correspondant au conducteur créé
     */
    @Override
    public ResponseDto create(RequestDto request) {
        ConducteurRequestDto conducteurRequest = (ConducteurRequestDto) request;
        return toDto(conducteurRepository.save(toEntity(conducteurRequest)));
    }

    /**
     * Met à jour l'entité Conducteur existante à partir des données fournies.
     *
     * @param id L'identifiant de l'entité Conducteur à modifier
     * @param request Les données de la requête (ConducteurRequestDto)
     * @return L'objet ResponseDto correspondant au conducteur modifié
     * @throws RuntimeException Si l'entité Conducteur n'existe pas
     */
    @Override
    public ResponseDto update(Long id, RequestDto request) {
        ConducteurRequestDto conducteurRequest = (ConducteurRequestDto) request;
        Conducteur conducteur = conducteurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conducteur non trouvé"));
        conducteur.setNom(conducteurRequest.getNom());
        conducteur.setMatricule(conducteurRequest.getMatricule());
        conducteur.setNumeroPermis(conducteurRequest.getNumeroPermis());
        return toDto(conducteurRepository.save(conducteur));
    }
}
