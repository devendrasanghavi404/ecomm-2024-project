package com.shop.app.ordersservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrdersDto {
    private int orderId;
    private int productId;
    private int quantity;
    private int userId;
    private int total;
    private int paymentId;
}
