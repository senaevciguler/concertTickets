package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    Long ticketId;
    int scheduleId;
    int ticketNumber;
    @ManyToOne
    @JoinColumn(name = "concertCategoryId")
    ConcertCategory concertCategory;

}
