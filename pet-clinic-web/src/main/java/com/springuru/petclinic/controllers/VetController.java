package com.springuru.petclinic.controllers;

import com.springuru.petclinic.model.PetType;
import com.springuru.petclinic.model.Vet;
import com.springuru.petclinic.services.PetTypeService;
import com.springuru.petclinic.services.VetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
@RequestMapping("/vets")
@RestController
public class VetController {
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public VetController(VetService vetService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @RequestMapping({"/", "" , "/index"})
    public Set<Vet> listvest(Model m) {
        return vetService.findAll();
    }
    @RequestMapping("/petTypes")
    public Set<PetType> pets()
    {
        return petTypeService.findAll();
    }

}
