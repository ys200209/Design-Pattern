package org.example.creational.prototype.prototype;

public class SoccerBall {
    private final int weight = 450;
    private final int diameter; // 지름
    private final Color color;

    public SoccerBall(int diameter, Color color) {
        this.diameter = diameter;
        this.color = color;
    }

    public SoccerBall copy() {
        return new SoccerBall(this.diameter, color.copy());
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SoccerBall{" +
                "weight=" + weight +
                ", diameter=" + diameter +
                ", color=" + color +
                '}';
    }
}
