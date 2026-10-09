package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.service.CourseService;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST exposant les endpoints de gestion des courses.
 */
@RestController
@RequestMapping("/courses")
public class CourseController extends CrudController {
    public CourseController(CourseService courseService) {
        super(courseService);
    }
}
