package nobel.rest.nestedjsonobject.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentDetails studentDetails;
}
