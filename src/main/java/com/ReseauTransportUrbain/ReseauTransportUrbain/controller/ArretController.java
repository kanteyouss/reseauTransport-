package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.service.ArretService;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST exposant les endpoints de gestion des arrets.
 */
@RestController
@RequestMapping("/arrets")
public class ArretController extends CrudController {
    public ArretController(ArretService arretService) {
        super(arretService);
    }
}
