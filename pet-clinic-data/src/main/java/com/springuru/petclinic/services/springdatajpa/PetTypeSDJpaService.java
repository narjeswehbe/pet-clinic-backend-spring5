package com.springuru.petclinic.services.springdatajpa;

import com.springuru.petclinic.model.PetType;
import com.springuru.petclinic.repositories.PetTypeRepository;
import com.springuru.petclinic.services.PetTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

   private final  PetTypeRepository petTypeRepository;
    @Override
    public Set<PetType> findAll() {
        Set<PetType>  petTypes = new HashSet<PetType>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType obj) {
        return petTypeRepository.save(obj);
    }

    @Override
    public void delete(PetType obj) {
            petTypeRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
