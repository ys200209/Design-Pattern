package org.example.creational.abstractfactory.apply;

import org.example.creational.abstractfactory.apply.factory.AbstractFactory;
import org.example.creational.abstractfactory.apply.factory.ConcreteFactory1;
import org.example.creational.abstractfactory.apply.factory.ConcreteFactory2;
import org.example.creational.abstractfactory.apply.producta.ProductA1;
import org.example.creational.abstractfactory.apply.productb.ProductB1;
import org.example.creational.abstractfactory.apply.productb.ProductB2;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory factory = factory();
        factory.run();
    }

    private static AbstractFactory factory() {
//        return new ConcreteFactory1(new ProductA1(), new ProductB1());
        return new ConcreteFactory2(new ProductA1(), new ProductB1());
    }
}
