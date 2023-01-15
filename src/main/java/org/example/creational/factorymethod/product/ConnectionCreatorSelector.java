package org.example.creational.factorymethod.product;

import java.util.Arrays;
import org.example.creational.factorymethod.creator.ConnectionCreator;
import org.example.creational.factorymethod.creator.MySQLConnectionCreator;
import org.example.creational.factorymethod.creator.OracleConnectionCreator;

public enum ConnectionCreatorSelector {
    MYSQL(ConnectionType.MYSQL, new MySQLConnectionCreator()),
    ORACLE(ConnectionType.ORACLE, new OracleConnectionCreator());

    private ConnectionType type;
    private ConnectionCreator creator;

    ConnectionCreatorSelector(ConnectionType type, ConnectionCreator creator) {
        this.type = type;
        this.creator = creator;
    }

    public static Connection create(ConnectionType type) {
        return Arrays.stream(values())
                .filter(selector -> selector.type == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("일치하는 커넥션 타입이 존재하지 않습니다."))
                .creator
                .create();
    }
}
