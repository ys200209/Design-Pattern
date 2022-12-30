package org.example.creational.abstractfactory.nonapply.samsung;

import org.example.creational.abstractfactory.nonapply.Factory;

public class SamsungFactory implements Factory {
    @Override
    public void makePhone() {
        System.out.println("갤럭시 폰 생성");
    }

    @Override
    public void makeLaptop() {
        System.out.println("삼성 노트북 생성");
    }
}
