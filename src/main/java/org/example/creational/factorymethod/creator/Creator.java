package org.example.creational.factorymethod.creator;

import java.awt.print.Paper;
import org.example.creational.factorymethod.product.Product;

public interface Creator {
    static Product redFactoryMethod() {
        return null;
    } // 빨간 종이를 생성하는 팩토리 메서드

    Product blueFactoryMethod(); // 파란 종이를 생성하는 팩토리 메서드
}
