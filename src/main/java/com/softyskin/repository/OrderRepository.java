package com.softyskin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.softyskin.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long>{
}