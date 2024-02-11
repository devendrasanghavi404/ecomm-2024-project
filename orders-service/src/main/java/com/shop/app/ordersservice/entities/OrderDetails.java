package com.shop.app.ordersservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "total")
    private int total;
    @Column(name = "payment_id")
    private int paymentId;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "updated_at")
    private Instant updatedAt;

    //cascade property allows Automatically does (save,delete) operations orderItems if any change in OrderItems Table(Parent Table).
    @OneToMany(mappedBy = "orderDetails", cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;



}
