package com.ReseauTransportUrbain.ReseauTransportUrbain.service;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.entity.Course;
import com.ReseauTransportUrbain.ReseauTransportUrbain.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course toEntity(CourseRequestDto courseRequest) {
        Course course = new Course();
        course.setHeureDepart(courseRequest.getHeureDepart());
        course.setHeureFin(courseRequest.getHeureFin());
        course.setStatut(courseRequest.getStatut());
        return course;
    }

    public CourseResponseDto toDto(Course course) {
        CourseResponseDto dto = new CourseResponseDto();
        dto.setId(course.getId());
        dto.setHeureDepart(course.getHeureDepart());
        dto.setHeureFin(course.getHeureFin());
        dto.setStatut(course.getStatut());
        return dto;
    }

    public List<CourseResponseDto> getAllCourses() {
        return courseRepository.findAll().stream().map(this::toDto).toList();
    }

    public CourseResponseDto getCourseById(Long id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course non trouvé"));
        return toDto(course);
    }

    public CourseResponseDto createCourse(CourseRequestDto courseRequest) {
        Course course = toEntity(courseRequest);
        courseRepository.save(course);
        return getCourseById(course.getId());
    }

    public CourseResponseDto updateCourseById(Long id, CourseRequestDto courseRequest) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course non trouvé"));
        course.setHeureDepart(courseRequest.getHeureDepart());
        course.setHeureFin(courseRequest.getHeureFin());
        course.setStatut(courseRequest.getStatut());
        courseRepository.save(course);
        return getCourseById(id);
    }

    public CourseResponseDto deleteCourseById(Long id) {
        CourseResponseDto dto = getCourseById(id);
        courseRepository.deleteById(id);
        return dto;
    }
}