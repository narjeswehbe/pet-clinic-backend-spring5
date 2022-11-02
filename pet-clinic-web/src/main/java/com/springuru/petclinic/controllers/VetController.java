package com.springuru.petclinic.controllers;

import com.springuru.petclinic.model.Vet;
import com.springuru.petclinic.services.VetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets.html"})
    public Set<Vet> listvest(Model m) {
        return vetService.findAll();
    }

}
