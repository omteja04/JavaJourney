<!--
    Author: omteja04
    Created on: 12-04-2024 21:44:04
    Description: CaseStudy
 -->

**Description:**
Polymorphism, derived from the Greek words "poly" meaning many and "morphs" meaning forms, refers to the ability of a single entity to take on multiple forms or behaviors. It is classified into two types: static or compile-time polymorphism and dynamic or runtime polymorphism.

**Runtime Polymorphism:**
Runtime polymorphism, also known as dynamic polymorphism, is the process of calling overridden methods at runtime rather than at compile time. In this process, the overridden methods are invoked using references of the superclass.

**Explanation:**
In the provided example, runtime polymorphism is achieved using inheritance. Two child classes, Car and Truck, inherit from the parent class Vehicle. Both child classes override the displayInfo method of the parent class to provide specific implementations.

In the main method, objects of the child classes Car and Truck are created and referred to by references of the superclass Vehicle. When the displayInfo method is called on these objects, the appropriate overridden method is invoked based on the actual type of the object at runtime. This demonstrates how runtime polymorphism allows for flexibility in method invocation and behavior based on the actual object type at runtime.
