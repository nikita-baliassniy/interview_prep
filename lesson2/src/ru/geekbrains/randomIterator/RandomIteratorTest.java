package ru.geekbrains.randomIterator;

import java.util.Iterator;

/**
 * Не уверен, что корректно понял допзадание
 * */
public class RandomIteratorTest {

    public static void main(String[] args) {
        Iterator<Integer> randomIterator = new RandomIterator(-20, 40);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomIterator.next());
        }
    }
}
