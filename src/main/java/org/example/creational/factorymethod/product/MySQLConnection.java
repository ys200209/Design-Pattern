package org.example.creational.factorymethod.product;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySQL에 연결되었습니다.");
    }
}
