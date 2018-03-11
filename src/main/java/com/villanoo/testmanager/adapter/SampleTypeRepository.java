package com.villanoo.testmanager.adapter;

import com.villanoo.testmanager.domain.SampleType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "sampleTypes", path = "sampleTypes")
public interface SampleTypeRepository extends MongoRepository<SampleType, String> {

    List<SampleType> findByName(@Param("name") String name);

}