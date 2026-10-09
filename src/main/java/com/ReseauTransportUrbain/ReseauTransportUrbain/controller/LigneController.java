package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.service.LigneService;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST exposant les endpoints de gestion des lignes.
 */
@RestController
@RequestMapping("/lignes")
public class LigneController extends CrudController {
    public LigneController(LigneService ligneService) {
        super(ligneService);
    }
}
