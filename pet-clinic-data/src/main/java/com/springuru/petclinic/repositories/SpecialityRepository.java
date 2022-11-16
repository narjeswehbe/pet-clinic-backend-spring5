package com.springuru.petclinic.repositories;

import com.springuru.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;


public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
