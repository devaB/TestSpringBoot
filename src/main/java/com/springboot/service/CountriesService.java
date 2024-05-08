package com.springboot.service;

import com.springboot.entity.Countries;

import java.util.List;

public interface CountriesService {
    List<Countries> findAll();
}
