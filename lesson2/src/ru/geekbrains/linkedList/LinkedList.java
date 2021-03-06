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

    class Link<T> {
        private T data;
        private Link<T> next;
        private Link<T> previous;

        public Link(T data) {
            this.data = data;
        }

        public Link<T> getNext() {
            return next;
        }

        public Link<T> getPrevious() {
            return previous;
        }

        public T getValue() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Link<T> next) {
            this.next = next;
        }

        public void setPrevious(Link<T> previous) {
            this.previous = previous;
        }
    }

}
