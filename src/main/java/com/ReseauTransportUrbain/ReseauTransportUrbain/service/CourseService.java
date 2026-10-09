package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.RequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.ResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Course;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.CourseRepository;
import org.springframework.stereotype.Service;

/**
 * Service métier gérant les Courses.
 * Fournit les opérations CRUD et les conversions entité/DTO.
 * La lecture (getAll, getById) et la suppression sont héritées
 * de {@link AbstractCrudService}.
 */
@Service
public class CourseService extends AbstractCrudService {
    private final CourseRepository courseRepository;

    /**
     * Constructeur injectant le repository des courses.
     *
     * @param courseRepository le repository des courses
     */
    public CourseService(CourseRepository courseRepository) {
        super(courseRepository);
        this.courseRepository = courseRepository;
    }

    /**
     * Construit une entité Course à partir des données de la requête.
     *
     * @param courseRequest Les données de la requête (CourseRequestDto)
     * @return L'entité Course construite
     */
    public Course toEntity(CourseRequestDto courseRequest) {
        Course course = new Course();
        course.setHeureDepart(courseRequest.getHeureDepart());
        course.setHeureFin(courseRequest.getHeureFin());
        course.setStatut(courseRequest.getStatut());
        return course;
    }

    /**
     * Convertit une entité Course en DTO de réponse.
     *
     * @param entity L'entité Course à convertir
     * @return L'objet ResponseDto correspondant
     */
    @Override
    public ResponseDto toDto(Object entity) {
        Course course = (Course) entity;
        CourseResponseDto dto = new CourseResponseDto();
        dto.setId(course.getId());
        dto.setHeureDepart(course.getHeureDepart());
        dto.setHeureFin(course.getHeureFin());
        dto.setStatut(course.getStatut());
        return dto;
    }

    /**
     * Crée une nouvelle entité Course à partir des données fournies.
     *
     * @param request Les données de la requête (CourseRequestDto)
     * @return L'objet ResponseDto correspondant à la course créée
     */
    @Override
    public ResponseDto create(RequestDto request) {
        CourseRequestDto courseRequest = (CourseRequestDto) request;
        return toDto(courseRepository.save(toEntity(courseRequest)));
    }

    /**
     * Met à jour l'entité Course existante à partir des données fournies.
     *
     * @param id L'identifiant de l'entité Course à modifier
     * @param request Les données de la requête (CourseRequestDto)
     * @return L'objet ResponseDto correspondant à la course modifiée
     * @throws RuntimeException Si l'entité Course n'existe pas
     */
    @Override
    public ResponseDto update(Long id, RequestDto request) {
        CourseRequestDto courseRequest = (CourseRequestDto) request;
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course non trouvé"));
        course.setHeureDepart(courseRequest.getHeureDepart());
        course.setHeureFin(courseRequest.getHeureFin());
        course.setStatut(courseRequest.getStatut());
        return toDto(courseRepository.save(course));
    }
}
