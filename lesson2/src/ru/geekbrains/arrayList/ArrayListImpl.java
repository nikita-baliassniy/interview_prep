package ru.geekbrains.arrayList;

import java.util.Arrays;

public class ArrayListImpl<T> implements ArrayList<T> {

    private static final int DEFAULT_SIZE = 10;

    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayListImpl(int initialSize) {
        this.data = (T[]) new Comparable[initialSize];
    }

    public ArrayListImpl() {
        this(DEFAULT_SIZE);
    }

    @Override
    public void add(T value) {
        if (data.length == size) {
            data = Arrays.copyOf(data, getNewLength());
        }
        data[size++] = value;
    }

    private int getNewLength() {
        return size == 0 ? 1 : (size * 3) / 2 + 1;
    }

    @Override
    public T get(int index) {
        if (isIndexCorrect(index)) {
            return data[index];
        } else {
            return null;
        }
    }

    private boolean isIndexCorrect(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
        return true;
    }

    @Override
    public boolean remove(T value) {
        return remove(indexOf(value)) != null;
    }

    @Override
    public T remove(int index) {
        if (isIndexCorrect(index)) {
            T removingValue = data[index];
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            size--;
            data[size] = null;
            return removingValue;
        } else {
            return null;
        }
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size -1; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        if (size > 0) {
            sb.append(data[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
