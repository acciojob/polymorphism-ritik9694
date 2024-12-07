package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Product of two integers: " + p.product(3, 4));
        System.out.println("Product of three integers: " + p.product(2, 3, 4)); // Task 4
        System.out.println("Product of two doubles: " + p.product(2.5, 4.5)); // Task 5
    }


}