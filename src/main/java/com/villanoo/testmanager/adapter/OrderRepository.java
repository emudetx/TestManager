package com.villanoo.testmanager.adapter;

import java.util.List;

import com.villanoo.testmanager.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository extends MongoRepository<Order, String> {

    List<Order> findByOrderId(@Param("orderId") String name);

}