package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.service.BusService;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST exposant les endpoints de gestion des bus.
 */
@RestController
@RequestMapping("/bus")
public class BusController extends CrudController {
    public BusController(BusService busService) {
        super(busService);
    }
}
