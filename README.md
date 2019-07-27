# TrainingDemo

User - Order - Product

A user can have zero or many orders.

Each order can have one or many products.

## User
String customerId;
String customerFirstName;
String customerLastName;
String customerEmail;
int customerPhone;
String customerAddress;
String customerPassword;
Date customerRegDate;

## Order 
String id;
Date date;
double totalAmount;
String status;
List<Product> orderedProducts;

## Product
String id;
String code;
String name;
double price;
String category;
String type;
String gender;
String size;
String color;
String description;
String brand;
String image;