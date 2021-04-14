package com.geraldo.cities1.cities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {

    private final CityRepository cityRepository;

    public CityResource(final CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    @GetMapping
    public List<City> buscarCidade(){
        return cityRepository.findAll();
    }
}
