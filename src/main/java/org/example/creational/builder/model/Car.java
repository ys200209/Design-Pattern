package org.example.creational.builder.model;

public class Car {
    private String product;

    public Car() {
        this.product = "자동차";
    }

    public void addOption(String option) {
        this.product = option + product;
    }

    public void show() {
        System.out.println(this.product);
    }
}
