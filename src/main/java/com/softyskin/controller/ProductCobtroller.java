package com.softyskin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softyskin.entity.Product;
import com.softyskin.repository.ProductRepository;

@RestController
public class ProductCobtroller {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping("/test")
	public List<Product> products(){
		List<Product> all = repository.findAll();
		return all;
	}

}
