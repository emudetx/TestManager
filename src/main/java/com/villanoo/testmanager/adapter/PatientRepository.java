package com.villanoo.testmanager.adapter;

import com.villanoo.testmanager.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "patients", path = "patients")
public interface PatientRepository extends MongoRepository<Patient, String> {

    List<Patient> findByName(@Param("name") String name);

}