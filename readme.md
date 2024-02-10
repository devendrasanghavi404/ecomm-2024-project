
Feb 10, 2024
E-commerce Website using React and Springboot

LINKS : 
https://fabric.inc/blog/commerce/ecommerce-database-design-example
https://hygraph.com/blog/ecommerce-microservices-architecture

Users
Roles-> Admins, Super Users, Users, User Preferences

Auditing

Products
Orders
Payment
Notifications
Cart
Inventory Management
Shipping
Reviews
Search
Admin Panel


Elastic search
Flow-> Order-Deliver-Refund/Exchange(If any)
Database-> MySQL/Mongo DB

Cache-> Redis

Communication between two services-> Feign Client

Database Details

1. Users
Id
Username
Password
Phn no
Email 
Firstname
Lastname

2.Roles
Admin
Users
Super Users

3.Orders
Id
Order Id
User Id
Address
Phone no
Products
Payment
Cost
Created at
Updated at

4.Products
Id
Name
Description
Category
Price
Created at
Updated at

5.Inventory
Id
Product Id
Quantity
Status
Stock date

6.Cart
Id
User Id
Product Id
Quantity

7.Payment
Id
Order Id
Date
Payment method
Amount
Transaction Id
Created Id
Updated Id




Softwares required






