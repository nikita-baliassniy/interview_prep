package ru.geekbrains;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    private int counter = 15;
    private final Lock lock = new ReentrantLock();

    private void counterDecrement() {
        try {
            if(lock.tryLock(10, TimeUnit.SECONDS)) {
                counter--;
                System.out.println("Thread " + Thread.currentThread().getId() +
                        " changed counter to " + counter);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        for (int i = 0; i < 15; i++) {
            new Thread(lockExample::counterDecrement).start();
        }
    }

}
