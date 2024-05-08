package com.springboot.service;

import com.springboot.entity.Countries;
import com.springboot.entity.State;

import java.util.List;

public interface StateService {
    List<State> findAll();
}
