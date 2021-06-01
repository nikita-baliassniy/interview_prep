package ru.geekbrains.polymorphismExample;

import java.util.ArrayList;
import java.util.List;

public class MainForShapes {

    public static void main(String[] args) {
            List<Shape> shapes = new ArrayList<>();
            Square square = new Square(10);
            Triangle triangle = new Triangle(3, 4, 5);
            Circle circle = new Circle(6);

            shapes.add(square);
            shapes.add(triangle);
            shapes.add(circle);

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getName());
            System.out.println(shape.getSquare());
            System.out.println(shape.getPerimeter());
        }
    }

}
