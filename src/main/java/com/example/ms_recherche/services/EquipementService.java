package com.example.ms_recherche.services;

import com.example.ms_recherche.models.Equipement;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EquipementService {

    private final RestTemplate restTemplate;

    public EquipementService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Equipement[] searchEquipments(String query) {
        String url = "http://localhost:8084/equipement/search?query=" + query;
        return restTemplate.getForObject(url, Equipement[].class);
    }
}
