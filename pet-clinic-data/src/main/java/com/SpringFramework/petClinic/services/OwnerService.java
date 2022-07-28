package com.SpringFramework.petClinic.services;

import com.SpringFramework.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
