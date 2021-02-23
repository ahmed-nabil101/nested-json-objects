package nobel.rest.nestedjsonobject.controllers;

import nobel.rest.nestedjsonobject.entity.Student;
import nobel.rest.nestedjsonobject.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Set<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.saveOrUpdate(student);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}
