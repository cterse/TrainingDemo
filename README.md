# TrainingDemo

User - Order - Product

A user can have zero or many orders.

Each order can have one or many products.

## User
String customerId;<br>
String customerFirstName;<br>
String customerLastName;<br>
String customerEmail;<br>
int customerPhone;<br>
String customerAddress;<br>
String customerPassword;<br>
Date customerRegDate;<br>

## Order 
String id;<br>
Date date;<br>
double totalAmount;<br>
String status;<br>
List<Product> orderedProducts;<br>

## Product
String id;<br>
String code;<br>
String name;<br>
double price;<br>
String category;<br>
String type;<br>
String gender;<br>
String size;<br>
String color;<br>
String description;<br>
String brand;<br>
String image;<br>