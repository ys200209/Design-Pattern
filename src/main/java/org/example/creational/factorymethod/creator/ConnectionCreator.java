package org.example.creational.factorymethod.creator;

import org.example.creational.factorymethod.product.Connection;
import org.example.creational.factorymethod.product.ConnectionCreatorSelector;
import org.example.creational.factorymethod.product.ConnectionType;

public abstract class ConnectionCreator {
    Connection connection;

    /*public Connection create(ConnectionType type) {
//        createConnection(); // 1. 커넥션 만들기
        connection = ConnectionCreatorSelector.getConnection(type);
        setConnectionId(); // 2. 커넥션에 ID 세팅하기
        setConnectionPassword(); // 3. 커넥션에 Password 세팅하기
        return connection; // 4. 커넥션 반환하기
    }*/

    /*public Connection create() { // True
        createConnection(); // 1. 커넥션 만들기
        setConnectionId(); // 2. 커넥션에 ID 세팅하기
        setConnectionPassword(); // 3. 커넥션에 Password 세팅하기
        return connection; // 4. 커넥션 반환하기
    }*/

    public Connection create(ConnectionType type) {
        createConnection(); // 1. 커넥션 만들기
        setConnectionId(); // 2. 커넥션에 ID 세팅하기
        setConnectionPassword(); // 3. 커넥션에 Password 세팅하기
        return connection; // 4. 커넥션 반환하기
    }

    protected abstract void createConnection();

    protected abstract void setConnectionId();

    protected abstract void setConnectionPassword();
}
