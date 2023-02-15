package org.example.creational.prototype;

import org.example.creational.prototype.client.Client;
import org.example.creational.prototype.prototype.Color;
import org.example.creational.prototype.prototype.SoccerBall;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        SoccerBall ballNo5 = new SoccerBall(22, new Color("White")); // 5호 공
        SoccerBall ballNo4 = new SoccerBall(21, new Color("White")); // 4호 공
        SoccerBall ballNo3 = new SoccerBall(19, new Color("White")); // 3호 공
        SoccerBall ballNo2 = new SoccerBall(15, new Color("White")); // 2호 공
        SoccerBall ballNo1 = new SoccerBall(15, new Color("White")); // 1호 공
        SoccerBall ballNo0 = new SoccerBall(12, new Color("White")); // 0호 공

        SoccerBall copyBallNo5 = ballNo5.copy();
        copyBallNo5.getColor().setColor("Black");

        System.out.println("ballNo5 = " + ballNo5);
        System.out.println("copyBallNo5 = " + copyBallNo5);
    }
}
