package com.shop.app.ordersservice.repositories;

import com.shop.app.ordersservice.entities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}
