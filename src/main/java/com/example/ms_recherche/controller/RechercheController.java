package com.example.ms_recherche.controller;

import com.example.ms_recherche.models.Location;
import com.example.ms_recherche.models.Equipement;
import com.example.ms_recherche.services.EquipementService;
import com.example.ms_recherche.services.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RechercheController {

    private final LocationService locationService;
    private final EquipementService equipementService;

    public RechercheController(LocationService locationService, EquipementService equipementService) {
        this.locationService = locationService;
        this.equipementService = equipementService;
    }

    @GetMapping("/search/locations")
    public Location[] searchByLocation(@RequestParam String query) {
        return locationService.searchLocations(query);
    }

    @GetMapping("/search/equipments")
    public Equipement[] searchByEquipment(@RequestParam String query) {
        return equipementService.searchEquipments(query);
    }
}
