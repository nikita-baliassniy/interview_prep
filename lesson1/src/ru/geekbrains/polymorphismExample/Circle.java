package ru.geekbrains.polymorphismExample;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getSquare() {
        return 3.1415 * radius * radius;
    }

    @Override
    protected double getPerimeter() {
        return 2 * 3.1415 * radius;
    }
}
