package com.springuru.petclinic.services.springdatajpa;

import com.springuru.petclinic.model.Owner;
import com.springuru.petclinic.repositories.OwnerRepository;
import com.springuru.petclinic.repositories.PetRepository;
import com.springuru.petclinic.repositories.PetTypeRepository;
import com.springuru.petclinic.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
@AllArgsConstructor
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;
    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).isPresent() ?
               ownerRepository.findById(aLong).get() : null;
    }

    @Override
    public Owner save(Owner obj) {

        return ownerRepository.save(obj);
    }

    @Override
    public void delete(Owner obj) {
        ownerRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
           ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastname) {

        return ownerRepository.findByLastName(lastname);
    }
}
