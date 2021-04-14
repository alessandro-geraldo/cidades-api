package com.geraldo.cities1.country;

import com.geraldo.cities1.country.Country;
import com.geraldo.cities1.country.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {


    private CountryRepository countryRepository;

    public CountryResource(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryRepository.findAll(page);
    }
    @GetMapping("/{id}")
    public Optional<Country> buscaPaisPorId(@PathVariable Long id){
        return countryRepository.findById(id);
    }
}
