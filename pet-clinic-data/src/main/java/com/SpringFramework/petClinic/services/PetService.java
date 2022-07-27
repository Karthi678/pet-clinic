package com.SpringFramework.petClinic.services;

import com.SpringFramework.petClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
