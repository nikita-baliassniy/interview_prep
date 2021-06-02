package ru.geekbrains;

public class PingPong {

    private static final int number = 10;
    private static boolean lock = false;

    private synchronized void ping() {
        int counter = number;
        while (counter != 0) {
            while (lock) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("ping");
            lock = true;
            notify();
            counter--;
        }
    }

    private synchronized void pong() {
        int counter = number;
        while (counter != 0) {
            while (!lock) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("pong");
            lock = false;
            notify();
            counter--;
        }
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        new Thread(pingPong::ping).start();
        new Thread(pingPong::pong).start();
    }

}
