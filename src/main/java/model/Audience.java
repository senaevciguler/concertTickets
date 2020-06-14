package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "audience")
@Data
public class Audience {
    @Id
    Long audienceId;
    String firstName;
    String lastName;
    String email;
    Date dateOfBirth;
    @OneToMany(mappedBy = "audience")
    List<Ticket> ticketList;
}
