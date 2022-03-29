package com.lifecartmain.models;

import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.naming.java.javaURLContextFactory;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	long id;
	String username;
	long prodID;
	int quantity;
	double price;
	public Orders() {
		super();
		this.username = null;
		this.prodID = -1;
		this.quantity = 0;
		this.price = 0;
	}
	public Orders(String username, long prodID, int quantity, double price) {
		super();
		this.username = username;
		this.prodID = prodID;
		this.quantity = quantity;
		this.price = price;
	}
	public Orders(long id, String username, long prodID, int quantity, double price) {
		super();
		this.id = id;
		this.username = username;
		this.prodID = prodID;
		this.quantity = quantity;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getProdID() {
		return prodID;
	}
	public void setProdID(long prodID) {
		this.prodID = prodID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
