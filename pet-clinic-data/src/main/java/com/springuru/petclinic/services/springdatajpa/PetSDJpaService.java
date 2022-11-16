package com.springuru.petclinic.services.springdatajpa;

import com.springuru.petclinic.model.Pet;
import com.springuru.petclinic.repositories.PetRepository;
import com.springuru.petclinic.services.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;

import java.util.HashSet;
import java.util.Set;
@RequiredArgsConstructor
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;
    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet obj) {
        return petRepository.save(obj);
    }

    @Override
    public void delete(Pet obj) {
    petRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
