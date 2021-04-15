package com.geraldo.cities1.states;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository stateRepository;

    public StateResource(final StateRepository stateRepository){
        this.stateRepository = stateRepository;

    }

    @GetMapping
    public List<State> buscaStado(){
        return stateRepository.findAll();
    }




}
