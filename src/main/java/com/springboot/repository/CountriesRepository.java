package com.springboot.repository;

import com.springboot.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "countriesapi")
public interface CountriesRepository extends JpaRepository<Countries, Integer> {
}
