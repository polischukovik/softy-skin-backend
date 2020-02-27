package com.softyskin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softyskin.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
	Product findByUuid(@Param("uuid") String uuid);
}