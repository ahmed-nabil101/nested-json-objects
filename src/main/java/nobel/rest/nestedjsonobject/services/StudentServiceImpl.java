package nobel.rest.nestedjsonobject.services;

import nobel.rest.nestedjsonobject.entity.Student;
import nobel.rest.nestedjsonobject.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Set<Student> findAll() {
        Set<Student> students = new HashSet<>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student saveOrUpdate(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
