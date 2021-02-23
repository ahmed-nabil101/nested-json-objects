package nobel.rest.nestedjsonobject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
}
