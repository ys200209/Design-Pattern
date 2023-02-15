package org.example.creational.prototype.client;

import org.example.creational.prototype.prototype.BallPrototype;

public class Client {
    private final BallPrototype prototype;

    public Client(BallPrototype prototype) {
        this.prototype = prototype;
    }

    public BallPrototype operation() {
        return prototype.clone();
    }
}
