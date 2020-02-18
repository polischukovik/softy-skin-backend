package com.softyskin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.softyskin.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{
}