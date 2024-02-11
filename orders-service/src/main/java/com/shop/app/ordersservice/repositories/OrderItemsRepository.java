package com.shop.app.ordersservice.repositories;

import com.shop.app.ordersservice.entities.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems,Integer> {
}
