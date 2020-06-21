package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity(name = "concert")
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
    Set<Schedule> schedules;
    BigDecimal pricePerEntry;
    String currency;
}

