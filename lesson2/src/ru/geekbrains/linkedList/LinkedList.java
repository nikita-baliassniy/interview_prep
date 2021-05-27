package ru.geekbrains.linkedList;

public interface LinkedList<T> {

    boolean isEmpty();

    void insertLeft(T value);

    void insertRight(T value);

    Link<T> removeLeft();

    Link<T> removeRight();

    int size();

    void display();

    T find(T value);

}
