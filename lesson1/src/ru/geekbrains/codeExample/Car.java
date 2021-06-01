package ru.geekbrains.codeExample;

/**
 * Исходил из того, что абстрактный метод open должен оставаться абстрактным и менять это нельзя
 * При наличии абстрактного метода open() класс нужно сделать абстрактным
 * + интерфейсы Moveable и Stopable лучше имплементить сразу здесь, чтобы не дублировать в дальнейших наследниках
 * метод open() также сделан protected
 * */
public abstract class Car implements  Moveable, Stopable{
    public Engine engine;
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    protected abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
