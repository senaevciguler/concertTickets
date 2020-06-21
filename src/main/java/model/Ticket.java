package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String ticketNumber;
    @OneToOne
    Concert concert;
    @OneToMany(fetch = FetchType.EAGER)
    Set<Audience> audienceList;
    BigDecimal totalPrice;
    String currency;
    @Enumerated(EnumType.STRING)
    private ConcertCategory concertCategory;

}
