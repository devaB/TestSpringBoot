package com.springboot.service;

import com.springboot.entity.Countries;
import com.springboot.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesServiceImpl implements CountriesService{

    @Autowired
    CountriesRepository countriesRepository;

    @Override
    public List<Countries> findAll() {
        return countriesRepository.findAll();
    }
}
