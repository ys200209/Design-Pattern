package org.example.creational.factorymethod.creator;

import org.example.creational.factorymethod.product.OracleConnection;

public class OracleConnectionCreator extends ConnectionCreator {
    @Override
    protected void createConnection() {
        connection = new OracleConnection();
    }

    @Override
    protected void setConnectionId() {
        System.out.println("Oracle 아이디 설정");
    }

    @Override
    protected void setConnectionPassword() {
        System.out.println("Oracle 비밀번호 설정");
    }
}
