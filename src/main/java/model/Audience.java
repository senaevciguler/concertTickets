package model;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "audiences")
@Data
public class Audience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;


}
