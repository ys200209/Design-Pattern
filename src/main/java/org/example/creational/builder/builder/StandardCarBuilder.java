package org.example.creational.builder.builder;

import org.example.creational.builder.model.Car;

public class StandardCarBuilder extends AbstractCarBuilder/*implements CarBuilder*/ {
    public Car car;

    @Override
    public void buildCar() {
        this.car = new Car();
    }

    @Override
    public void buildWheel() {
        car.addOption("바퀴가 4개 달린 ");
    }

    @Override
    public void buildWing() {
        car.addOption("날개가 없는 ");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
