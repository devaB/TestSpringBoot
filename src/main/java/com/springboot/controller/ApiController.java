package com.springboot.controller;

import com.springboot.entity.State;
import com.springboot.service.StateService;
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
    StateService stateService;

    @RequestMapping(value = "/getAllStates", method = RequestMethod.GET)
    public ResponseEntity<List<State>> getAllStates() {
        return new ResponseEntity<List<State>>(stateService.findAll(), HttpStatus.OK);
    }
}
