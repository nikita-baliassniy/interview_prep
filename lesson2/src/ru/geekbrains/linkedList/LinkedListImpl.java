package ru.geekbrains.linkedList;

public class LinkedListImpl<T> implements LinkedList<T> {

    private Link<T> first;
    private Link<T> last;
    private int size;

    public LinkedListImpl() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void insertLeft(T value) {
        Link<T> link = new Link<>(value);
        link.setNext(first);
        link.setPrevious(null);
        if (first != null) {
            first.setPrevious(link);
        }
        first = link;
        if (last == null) {
            last = first;
        }
        size++;
    }

    @Override
    public void insertRight(T value) {
        Link<T> link = new Link<>(value);
        if (last != null) {
            last.setNext(link);
        }
        link.setNext(null);
        link.setPrevious(last);
        last = link;
        size++;
    }

    @Override
    public Link<T> removeLeft() {
        Link<T> temp = first;
        first = first.getNext();
        first.setPrevious(null);
        size--;
        return temp;
    }

    @Override
    public Link<T> removeRight() {
        Link<T> temp = last;
        last = last.getPrevious();
        last.setNext(null);
        size--;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public T find(T value) {
        Link<T> nodeToFind = new Link<>(value);
        Link<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.getValue().equals(nodeToFind.getValue())) {
                return nodeToFind.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Link<T> currentNode = first;
        while (currentNode != null) {
            sb.append(currentNode.getValue());
            if (currentNode.getNext() != null) {
                sb.append(", ");
            }
            currentNode = currentNode.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
