package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.LigneResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.RequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Ligne;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.LigneRepository;
import org.springframework.stereotype.Service;

/**
 * Service métier gérant les Lignes.
 * Fournit les opérations CRUD et les conversions entité/DTO.
 * La lecture (getAll, getById) et la suppression sont héritées
 * de {@link AbstractCrudService}.
 */
@Service
public class LigneService extends AbstractCrudService {
    private final LigneRepository ligneRepository;

    /**
     * Constructeur injectant le repository des lignes.
     *
     * @param ligneRepository le repository des lignes
     */
    public LigneService(LigneRepository ligneRepository) {
        super(ligneRepository);
        this.ligneRepository = ligneRepository;
    }

    /**
     * Construit une entité Ligne à partir des données de la requête.
     *
     * @param ligneRequest Les données de la requête (LigneRequestDto)
     * @return L'entité Ligne construite
     */
    public Ligne toEntity(LigneRequestDto ligneRequest) {
        Ligne ligne = new Ligne();
        ligne.setCode(ligneRequest.getCode());
        ligne.setZone(ligneRequest.getZone());
        ligne.setLibelle(ligneRequest.getLibelle());
        ligne.setTerminusDepart(ligneRequest.getTerminusDepart());
        ligne.setTerminusArrivee(ligneRequest.getTerminusArrivee());
        return ligne;
    }

    /**
     * Convertit une entité Ligne en DTO de réponse.
     *
     * @param entity L'entité Ligne à convertir
     * @return L'objet ResponseDto correspondant
     */
    @Override
    public ResponseDto toDto(Object entity) {
        Ligne ligne = (Ligne) entity;
        LigneResponseDto dto = new LigneResponseDto();
        dto.setId(ligne.getId());
        dto.setCode(ligne.getCode());
        dto.setZone(ligne.getZone());
        dto.setLibelle(ligne.getLibelle());
        dto.setTerminusDepart(ligne.getTerminusDepart());
        dto.setTerminusArrivee(ligne.getTerminusArrivee());
        return dto;
    }

    /**
     * Crée une nouvelle entité Ligne à partir des données fournies.
     *
     * @param request Les données de la requête (LigneRequestDto)
     * @return L'objet ResponseDto correspondant à la ligne créée
     */
    @Override
    public ResponseDto create(RequestDto request) {
        LigneRequestDto ligneRequest = (LigneRequestDto) request;
        return toDto(ligneRepository.save(toEntity(ligneRequest)));
    }

    /**
     * Met à jour l'entité Ligne existante à partir des données fournies.
     *
     * @param id L'identifiant de l'entité Ligne à modifier
     * @param request Les données de la requête (LigneRequestDto)
     * @return L'objet ResponseDto correspondant à la ligne modifiée
     * @throws RuntimeException Si l'entité Ligne n'existe pas
     */
    @Override
    public ResponseDto update(Long id, RequestDto request) {
        LigneRequestDto ligneRequest = (LigneRequestDto) request;
        Ligne ligne = ligneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ligne non trouvé"));
        ligne.setCode(ligneRequest.getCode());
        ligne.setZone(ligneRequest.getZone());
        ligne.setLibelle(ligneRequest.getLibelle());
        ligne.setTerminusDepart(ligneRequest.getTerminusDepart());
        ligne.setTerminusArrivee(ligneRequest.getTerminusArrivee());
        return toDto(ligneRepository.save(ligne));
    }
}
