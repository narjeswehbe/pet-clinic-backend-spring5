package com.springuru.petclinic.services.springdatajpa;

import com.springuru.petclinic.model.Speciality;
import com.springuru.petclinic.repositories.SpecialityRepository;
import com.springuru.petclinic.services.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;

import java.util.HashSet;
import java.util.Set;
@RequiredArgsConstructor
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {
    private final SpecialityRepository specialtyRepository;
    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality obj) {
        return specialtyRepository.save(obj);
    }

    @Override
    public void delete(Speciality obj) {
        specialtyRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
            specialtyRepository.deleteById(aLong);
    }
}
