package com.springuru.petclinic.controllers;

import com.springuru.petclinic.model.Owner;
import com.springuru.petclinic.services.OwnerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/owners")
@RestController
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"/" , "/index" , "/index.html" , ""})
    public Set<Owner> listOfOwners(){

        return ownerService.findAll();
    }
}
