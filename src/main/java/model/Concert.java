package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

@Entity
@Data
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Enumerated(EnumType.STRING)
    ConcertCategory concertCategory;
    String singerName;
    String address;
    @OneToMany(fetch = FetchType.EAGER)
    List<Schedule> scheduleList;
    BigDecimal pricePerEntry;
    Currency currency;
}

