package com.softyskin.entity;

import java.util.Base64;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
	private ObjectId id;
	private String uuid;	
	private String name;	
	private String description;	
	private String size;	
	private Double price;	
	private Integer position;	
	private Binary image;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getImage() {
		return new String(image.getData());
	}

	public void setImage(String image) {
		this.image = new Binary(image.getBytes());
//		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [id=" + uuid + ", name=" + name + ", size=" + size + "]";
	}
	
}
