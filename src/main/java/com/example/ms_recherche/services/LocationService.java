package com.example.ms_recherche.services;

import com.example.ms_recherche.models.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {

    private final RestTemplate restTemplate;

    public LocationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Location[] searchLocations(String query) {
        String url = "http://localhost:8083/api/locations/search?query=" + query;
        return restTemplate.getForObject(url, Location[].class);
    }
}
