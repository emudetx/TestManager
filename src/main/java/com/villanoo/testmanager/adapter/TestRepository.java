package com.villanoo.testmanager.adapter;

import com.villanoo.testmanager.domain.AbstractTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "tests", path = "tests")
public interface TestRepository extends MongoRepository<AbstractTest, String> {

    List<AbstractTest> findByName(@Param("name") String name);

}