package org.example.creational.factorymethod;

import org.example.creational.factorymethod.creator.Creator;
import org.example.creational.factorymethod.creator.PaperCreator;
import org.example.creational.factorymethod.product.Product;

public class FactoryMethodMain {
    public static void main(String[] args) {
        /**
         * - Product: 팩토리 메서드가 생성하는 객체의 인터페이스를 정의합니다.
         *
         * - Creator: Product 타입의 객체를 반환하는 팩토리 메서드를 선언합니다.
         * Creator 클래스는 팩토리 메서드를 기본적으로 구현하는데, 이 구현에서는 ConcreteProduct 객체를 반환합니다.
         * 또한 Product 객체의 생성을 위해 팩토리 메서드를 호출합니다.
         */

        /**
         * 구현 방법
         * 1. Creator 클래스를 추상 클래스로 정의하고, 정의한 팩토리 메서드에 대한 구현은 제공하지 않는 경우
         * 2. Creator가 구체 클래스이고, 팩토리 메서드에 대한 기본 구현을 제공하는 경우
         */

        Creator creator = new PaperCreator();
        Product product = creator.redFactoryMethod();
    }
}
