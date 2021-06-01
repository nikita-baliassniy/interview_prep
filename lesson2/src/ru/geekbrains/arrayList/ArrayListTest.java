package ru.geekbrains.arrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayListImpl<>();

        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);

        arrayList.display();

        arrayList.remove(3);
        arrayList.remove((Integer) 20);

        arrayList.display();
        System.out.println("List size: " + arrayList.size());
        System.out.println("List is empty: " + arrayList.isEmpty());
        System.out.println("List contains 5: " + arrayList.contains(5));
        System.out.println("List contains 20: " + arrayList.contains(20));

    }
}
