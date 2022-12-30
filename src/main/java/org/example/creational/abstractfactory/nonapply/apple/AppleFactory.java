package org.example.creational.abstractfactory.nonapply.apple;

import org.example.creational.abstractfactory.nonapply.Factory;

public class AppleFactory implements Factory {
    @Override
    public void makePhone() {
        System.out.println("아이폰 생성");
    }

    @Override
    public void makeLaptop() {
        System.out.println("맥북 생성");
    }
}
