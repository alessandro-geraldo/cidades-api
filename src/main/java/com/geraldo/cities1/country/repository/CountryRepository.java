package com.geraldo.cities1.country.repository;

import com.geraldo.cities1.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
