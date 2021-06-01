package ru.geekbrains.linkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedListImpl<>();

        linkedList.insertLeft(20);
        linkedList.insertLeft(15);
        linkedList.insertLeft(10);
        linkedList.insertRight(25);
        linkedList.insertRight(30);

        linkedList.display();

        linkedList.removeLeft();
        linkedList.removeRight();
        linkedList.removeRight();

        linkedList.display();

        System.out.println("List size: " + linkedList.size());
        System.out.println("List is empty: " + linkedList.isEmpty());
        System.out.println(linkedList.find(20));
    }

}
