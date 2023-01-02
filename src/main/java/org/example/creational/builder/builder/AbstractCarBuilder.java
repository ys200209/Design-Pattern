package org.example.creational.builder.builder;

import org.example.creational.builder.model.Car;

public abstract class AbstractCarBuilder {
    Car car;

    public void buildCar() {
        car = new Car();
    }

    public abstract void buildWheel();

    public abstract void buildWing();

    public Car getCar() {
        return this.car;
    }
}
