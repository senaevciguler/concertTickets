package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

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
    List<Audience> audienceList;
    BigDecimal totalPrice;
    Currency currency;
    @Enumerated(EnumType.STRING)
    private ConcertCategory concertCategory;

}
