package com.springboot.service;

import com.springboot.entity.Countries;
import com.springboot.entity.State;
import com.springboot.repository.CountriesRepository;
import com.springboot.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService{

    @Autowired
    StateRepository stateRepository;

    @Override
    public List<State> findAll() {
        return stateRepository.findAll();
    }
}
