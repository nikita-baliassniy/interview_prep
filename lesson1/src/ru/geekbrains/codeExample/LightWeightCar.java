package ru.geekbrains.codeExample;

/**
 * Абстрактный метод open(), имплементированный в этом классе, также сделан protected
 * */

public class LightWeightCar extends Car {

    @Override
    protected void open() {
        System.out.println("Car is open");
    }
}
