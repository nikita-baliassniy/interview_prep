package ru.geekbrains.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.boot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

