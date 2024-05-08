package com.springboot.controller;

import com.springboot.entity.Countries;
import com.springboot.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    CountriesService countriesService;

    @RequestMapping(value = "/getAllCountries", method = RequestMethod.GET)
    public ResponseEntity<List<Countries>> getAllCountries() {
        return new ResponseEntity<List<Countries>>(countriesService.findAll(), HttpStatus.OK);
    }
}
