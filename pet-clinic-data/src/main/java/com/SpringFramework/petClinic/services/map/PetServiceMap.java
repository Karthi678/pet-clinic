package com.SpringFramework.petClinic.services.map;


import com.SpringFramework.petClinic.model.Pet;
import com.SpringFramework.petClinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
