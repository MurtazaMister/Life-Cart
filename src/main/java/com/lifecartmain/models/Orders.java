package com.lifecartmain.models;

import java.sql.Date;

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
	Date dateTime;
	public Orders(String username, long prodID, int quantity, double price, Date dateTime) {
		super();
		this.username = username;
		this.prodID = prodID;
		this.quantity = quantity;
		this.price = price;
		this.dateTime = dateTime;
	}
	public Orders(long id, String username, long prodID, int quantity, double price, Date dateTime) {
		super();
		this.id = id;
		this.username = username;
		this.prodID = prodID;
		this.quantity = quantity;
		this.price = price;
		this.dateTime = dateTime;
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
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
