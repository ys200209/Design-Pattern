package org.example.creational.builder.builder;

import org.example.creational.builder.model.Car;

public abstract class AbstractCarBuilder {
    Car car;

    public void buildCar() {
        car = new Car();
    }

    abstract public void buildWheel();

    abstract public void buildWing();

    public Car getCar() {
        return this.car;
    }
}
