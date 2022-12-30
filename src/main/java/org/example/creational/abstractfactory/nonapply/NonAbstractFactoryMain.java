package org.example.creational.abstractfactory.nonapply;

import org.example.creational.abstractfactory.nonapply.apple.AppleFactory;
import org.example.creational.abstractfactory.nonapply.samsung.SamsungFactory;

public class NonAbstractFactoryMain {
    public static void main(String[] args) {
        Factory factory = getFactory();
        factory.makePhone();
        factory.makeLaptop();
    }

    private static Factory getFactory() { // 이곳에서 둘 중에 원하는 제품의 공장을 선택하면 된다.
        return new SamsungFactory();
//        return new AppleFactory();
    }
}
