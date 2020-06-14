package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "audience")
@Data
public class Audience {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long audienceId;
    String firstName;
    String lastName;
    String email;
    Date dateOfBirth;
    @OneToMany(mappedBy = "audience")
    List<Ticket> ticketList;
}
