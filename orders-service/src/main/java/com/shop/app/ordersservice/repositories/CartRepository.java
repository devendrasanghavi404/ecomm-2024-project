package com.shop.app.ordersservice.repositories;

import com.shop.app.ordersservice.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
