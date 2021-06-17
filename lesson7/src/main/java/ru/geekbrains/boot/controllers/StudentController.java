package ru.geekbrains.boot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.boot.exception.ResourceNotFoundException;
import ru.geekbrains.boot.model.Student;
import ru.geekbrains.boot.services.StudentService;

import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

   // GET http://localhost:8189/app/students
    @GetMapping
    public String showAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteBydId(id);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("No student with id " + id));
    }

    @GetMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable Long id, HttpServletResponse response) {
        studentService.deleteBydId(id);
        return "redirect:/students";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_student";
    }

    @PostMapping("/add")
    public String addNewStudent(@ModelAttribute Student newStudent) {
        studentService.save(newStudent);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "edit_student";
    }

    @PostMapping("/edit")
    public String modifyStudent(@ModelAttribute Student modifiedStudent) {
        studentService.save(modifiedStudent);
        return "redirect:/students";
    }


}
