package ru.geekbrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private final SessionFactory factory;

    @Transactional
    @Override
    public List<Student> findAll() {
        List<Student> allStudents;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            allStudents = session.createQuery("from Student").getResultList();
            session.getTransaction().commit();
            session.close();
        }
        return allStudents;
    }

    @Transactional
    @Override
    public Student saveOrUpdate(Student student) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            if (findById(student.getId()) == null) {
                session.save(student);
            } else {
                session.update(student);
            }
            session.getTransaction().commit();
            session.close();
        }
        return student;
    }

    @Transactional
    @Override
    public Student findById(Long id) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            session.close();
            return student;
        }
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.delete(student);
            }
            session.getTransaction().commit();
        }
    }

    @Override
    public void shutdown() {
        factory.close();
    }

    public StudentDAOImpl() {
        factory = SessionFactoryBuilder.getFactory();
    }

}
