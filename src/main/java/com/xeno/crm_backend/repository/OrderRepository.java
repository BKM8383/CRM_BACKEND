package com.xeno.crm_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.xeno.crm_backend.model.Order;


@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
	
}