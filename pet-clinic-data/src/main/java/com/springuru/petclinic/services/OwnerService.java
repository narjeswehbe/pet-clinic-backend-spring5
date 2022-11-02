package com.springuru.petclinic.services;

import com.springuru.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastname);


}
