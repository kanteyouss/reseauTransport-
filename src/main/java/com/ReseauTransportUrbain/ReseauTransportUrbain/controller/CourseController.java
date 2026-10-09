package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.CourseResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseResponseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseResponseDto getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public CourseResponseDto createCourse(@RequestBody CourseRequestDto courseRequest) {
        return courseService.createCourse(courseRequest);
    }

    @PutMapping("/{id}")
    public CourseResponseDto updateCourseById(@PathVariable Long id, @RequestBody CourseRequestDto courseRequest) {
        return courseService.updateCourseById(id, courseRequest);
    }

    @DeleteMapping("/{id}")
    public CourseResponseDto deleteCourseById(@PathVariable Long id) {
        return courseService.deleteCourseById(id);
    }
}