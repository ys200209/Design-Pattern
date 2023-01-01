package org.example.creational.builder.builder;

public class SpecialCarBuilder extends AbstractCarBuilder {
    @Override
    public void buildWheel() {
        car.addOption("바퀴가 12개 달린 ");
    }

    @Override
    public void buildWing() {
        car.addOption("날개가 무수히 달린 ");
    }
}
