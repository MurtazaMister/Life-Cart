package com.lifecartmain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lifecartmain.models.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{
	@Query("SELECT e.id, e.prodID, e.quantity, e.username FROM Cart e where username=?1")
	List<Object[]> findAllByUsername(String username);
}
