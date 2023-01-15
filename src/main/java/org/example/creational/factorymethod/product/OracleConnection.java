package org.example.creational.factorymethod.product;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle에 연결되었습니다.");
    }
}
