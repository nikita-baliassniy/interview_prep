package ru.geekbrains.builder;

public class MainForBuilder {

    public static void main(String[] args) {

        Person.Builder personBuilder = Person.newBuilder();
        personBuilder.addFirstName("Ivan");
        personBuilder.addLastName("Ivanov");
        personBuilder.addMiddleName("Ivanovich");
        personBuilder.addCountry("Russia");
        personBuilder.addAddress("Lenina 25, 10");
        personBuilder.addAge(40);
        personBuilder.addGender("Male");
        personBuilder.addPhone("+7(999)999-99-99");

        System.out.println(personBuilder.toString());
    }

}
