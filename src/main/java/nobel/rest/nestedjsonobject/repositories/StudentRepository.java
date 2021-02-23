package nobel.rest.nestedjsonobject.repositories;

import nobel.rest.nestedjsonobject.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
