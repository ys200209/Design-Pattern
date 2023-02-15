package org.example.creational.prototype.prototype;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Color copy() {
        return new Color(this.color);
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
