package com.ReseauTransportUrbain.ReseauTransportUrbain.controller;

import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusRequestDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.dto.BusResponseDto;
import com.ReseauTransportUrbain.ReseauTransportUrbain.service.BusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<BusResponseDto> getAllBus() {
        return busService.getAllBus();
    }

    @GetMapping("/{id}")
    public BusResponseDto getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }

    @PostMapping
    public BusResponseDto createBus(@RequestBody BusRequestDto busRequest) {
        return busService.createBus(busRequest);
    }

    @PutMapping("/{id}")
    public BusResponseDto updateBusById(@PathVariable Long id, @RequestBody BusRequestDto busRequest) {
        return busService.updateBusById(id, busRequest);
    }

    @DeleteMapping("/{id}")
    public BusResponseDto deleteBusById(@PathVariable Long id) {
        return busService.deleteBusById(id);
    }
}