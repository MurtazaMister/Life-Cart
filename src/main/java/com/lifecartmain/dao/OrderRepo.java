package com.lifecartmain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lifecartmain.models.Orders;

public interface OrderRepo extends JpaRepository<Orders, Long>{

}
