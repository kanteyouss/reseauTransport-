package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.service.ConducteurService;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST exposant les endpoints de gestion des conducteurs.
 */
@RestController
@RequestMapping("/conducteurs")
public class ConducteurController extends CrudController {
    public ConducteurController(ConducteurService conducteurService) {
        super(conducteurService);
    }
}