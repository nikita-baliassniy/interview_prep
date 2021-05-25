package ru.geekbrains.polymorphismExample;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double getSquare() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - a) * (getPerimeter() - b) * (getPerimeter() - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
