package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    private Long ticketId;
    private int scheduleId;
    private int ticketNumber;
    @ManyToOne
    @JoinColumn(name = "audienceId")
    Audience audience;
    private ConcertCategory concertCategory;

}
