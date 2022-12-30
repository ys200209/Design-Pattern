package org.example.creational.abstractfactory.apply.factory;

import org.example.creational.abstractfactory.apply.producta.AbstractProductA;
import org.example.creational.abstractfactory.apply.productb.AbstractProductB;

public class ConcreteFactory1 implements AbstractFactory {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public ConcreteFactory1(AbstractProductA productA, AbstractProductB productB) {
        this.productA = productA;
        this.productB = productB;
    }

    @Override
    public void run() {
        System.out.println("팩토리 1 실행");
        productA.run();
        productB.run();
    }
}
