package org.example.creational.abstractfactory.apply.factory;

import org.example.creational.abstractfactory.apply.producta.AbstractProductA;
import org.example.creational.abstractfactory.apply.productb.AbstractProductB;

public class ConcreteFactory2 implements AbstractFactory {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public ConcreteFactory2(AbstractProductA productA, AbstractProductB productB) {
        this.productA = productA;
        this.productB = productB;
    }

    @Override
    public void run() {
        System.out.println("팩토리 2 실행");
        productA.run();
        productB.run();
    }
}
