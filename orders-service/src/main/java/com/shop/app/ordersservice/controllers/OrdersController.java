package com.shop.app.ordersservice.controllers;

import com.shop.app.ordersservice.dtos.OrdersDto;
import com.shop.app.ordersservice.entities.OrderDetails;
import com.shop.app.ordersservice.entities.OrderItems;

import com.shop.app.ordersservice.repositories.CartRepository;
import com.shop.app.ordersservice.repositories.OrderDetailsRepository;
import com.shop.app.ordersservice.repositories.OrderItemsRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@Slf4j
@RequestMapping("/api")
public class OrdersController {
    static String className = "com.shop.app.ordersservice.controllers";

    private static final Logger logger = Logger.getLogger(className);
    @Autowired
    OrderItemsRepository orderItemsRepository;
    @Autowired
    OrderDetailsRepository orderDetailsRepository;
    @Autowired
    CartRepository cartRepository;

    @PostMapping(value = "/saveDetails")
    public String saveOrderDetails(@RequestBody OrdersDto ordersDto){
        String response="";
        try{
           List<OrderItems> list =new ArrayList<>();
            OrderDetails orderDetails=new OrderDetails();
            orderDetails.setUserId(1);
            orderDetails.setTotal(1000);
            orderDetails.setPaymentId(101023);
            orderDetails.setCreatedAt(Instant.now());
            orderDetails.setUpdatedAt(Instant.now());
            orderDetailsRepository.save(orderDetails);

            OrderItems orderItems=new OrderItems();
            orderItems.setCreatedAt(Instant.now());
            orderItems.setUpdatedAt(Instant.now());
            orderItems.setQuantity(4);
            orderItems.setProductId(1);
            orderItems.setOrderDetails(orderDetails);
            list.add(orderItems);
            OrderItems orderItems2=new OrderItems();
            orderItems2.setCreatedAt(Instant.now());
            orderItems2.setUpdatedAt(Instant.now());
            orderItems2.setQuantity(40);
            orderItems2.setProductId(2);
            orderItems2.setOrderDetails(orderDetails);
            list.add(orderItems2);
            orderItemsRepository.saveAll(list);




            response="saved";

        }
        catch (Exception e){
            logger.info("Exception in saveOrderDetails"+e.getStackTrace());
        }
        return response;
    }
    @DeleteMapping(value = "/deleteOrder")
    public String savePayment(@PathVariable int orderId){
        String response="";
        try{

            orderDetailsRepository.deleteById(orderId);

            response="saved";

        }
        catch (Exception e){
            logger.info("Exception in savePayment"+e.getStackTrace());
        }
        return response;
    }
}
