package ru.geekbrains;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    private void prepareTable() {
        StudentDAO studentDAO = new StudentDAOImpl();
        Random random = new Random();
        try {
            Scanner scanner = new Scanner(new File("src\\main\\resources\\names.txt"));
            for (int i = 0; i < 1000; i++) {
                Student current = new Student(
                        (long) i + 1,
                        scanner.nextLine().trim(),
                        random.nextInt(100));
                studentDAO.saveOrUpdate(current);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new Main().prepareTable();
        StudentDAO studentDAO = new StudentDAOImpl();
        System.out.println(studentDAO.findById(11L));
        studentDAO.deleteById(11L);
        System.out.println(studentDAO.findById(11L));

        System.out.println(studentDAO.findById(100L));
        studentDAO.saveOrUpdate(new Student(100L, "Pupkin", 100));
        System.out.println(studentDAO.findById(100L));

    }
}
