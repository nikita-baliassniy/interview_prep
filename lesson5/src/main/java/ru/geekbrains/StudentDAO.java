package ru.geekbrains;

import java.util.List;

public interface StudentDAO {

    void shutdown();

    List<Student> findAll();

    Student saveOrUpdate(Student student);

    Student findById(Long id);

    void deleteById(Long id);

}
