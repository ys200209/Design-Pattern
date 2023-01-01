package org.example.creational.builder.director;

import org.example.creational.builder.builder.AbstractCarBuilder;
import org.example.creational.builder.model.Car;

public class CarDirector {
    private AbstractCarBuilder builder;

    public CarDirector(AbstractCarBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.buildCar();
        builder.buildWheel();
        builder.buildWing();
    }

    public Car getCar() {
        return builder.getCar();
    }
}
