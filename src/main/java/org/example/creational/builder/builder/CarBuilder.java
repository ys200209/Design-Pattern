package org.example.creational.builder.builder;

import org.example.creational.builder.model.Car;

public interface CarBuilder {

    void buildCar();
    void buildWheel();
    void buildWing();
    Car getCar();

    /**
     * Builder에 있는 메서드를 모두 재정의하지 않고 필요한 메서드만 재정의하도록 만들고 싶다.
     * 따라서 인터페이스가 아닌, 추상 클래스로 Builder를 생성하거나, 혹은 재정의가 강제적이지 않은 메서드로 선언해야 할듯.
     */
}
