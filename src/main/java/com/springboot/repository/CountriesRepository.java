package com.springboot.repository;

import com.springboot.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path="countriesApi")
public interface CountriesRepository extends JpaRepository<Countries, Integer> {
    Countries findByName(String countryName);
}
