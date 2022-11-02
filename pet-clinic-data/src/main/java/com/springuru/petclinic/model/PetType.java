package com.springuru.petclinic.model;

public class PetType extends BaseEntity {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PetType{" +
                "name='" + name + '\'' +
                '}';
    }
}
