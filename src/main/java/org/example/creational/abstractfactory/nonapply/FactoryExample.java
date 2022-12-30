package org.example.creational.abstractfactory.nonapply;

public class FactoryExample implements Factory {
    private Factory factory;

    public FactoryExample(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void makePhone() {
        factory.makePhone();
    }

    @Override
    public void makeLaptop() {
        factory.makeLaptop();
    }
}
