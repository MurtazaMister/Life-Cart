package com.lifecartmain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifecartmain.models.Grocery;
import com.lifecartmain.models.User;

public interface GroceryRepo extends JpaRepository<Grocery, Long>{
	@Query("update Grocery set quantity = quantity - ?1 where id = ?2")
	void update(long prodID, int quantity);
	
	@Query("select quantity from Grocery where id=?1")
	int getQuantity(long prodID);
	
	@Query("select sellPrice from Grocery where id = ?1")
	double getSellPrice(long prodID);
}
