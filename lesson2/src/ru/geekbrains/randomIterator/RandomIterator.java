package ru.geekbrains.randomIterator;

import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {

    private final int minValue;
    private final int limit;

    public RandomIterator(int min, int limit) {
        this.minValue = min;
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return (int)(Math.random() * (limit + 1)) + minValue;
    }
}
