package ru.geekbrains.boot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.boot.model.Student;
import ru.geekbrains.boot.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

//    public Student saveOrUpdate(Student s) {
//        return studentRepository.saveOrUpdate(s);
//    }

    public Student save(Student s) {
        return studentRepository.save(s);
    }

//    public Student update(Student s) {
//        return studentRepository.
//    }

    public void deleteBydId(Long id) {
        studentRepository.deleteById(id);
    }
}
