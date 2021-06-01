package ru.geekbrains.polymorphismExample;

public class Square extends Shape {

    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    protected double getSquare() {
        return a * a;
    }

    @Override
    protected double getPerimeter() {
        return 4 * a;
    }
}
