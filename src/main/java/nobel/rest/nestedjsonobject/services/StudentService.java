package nobel.rest.nestedjsonobject.services;

import nobel.rest.nestedjsonobject.entity.Student;

import java.util.Set;

public interface StudentService {
    Set<Student> findAll();
    Student findById(Long id);
    Student saveOrUpdate(Student student);
    void deleteById(Long id);
}
