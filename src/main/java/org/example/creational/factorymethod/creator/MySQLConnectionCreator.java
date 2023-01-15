package org.example.creational.factorymethod.creator;

import org.example.creational.factorymethod.product.MySQLConnection;

public class MySQLConnectionCreator extends ConnectionCreator {
    @Override
    protected void createConnection() {
        connection = new MySQLConnection();
    }

    @Override
    protected void setConnectionId() {
        System.out.println("MySQL 아이디 설정");
    }

    @Override
    protected void setConnectionPassword() {
        System.out.println("MySQL 비밀번호 설정");
    }
}
