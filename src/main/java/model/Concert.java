package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

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
    List<Schedule> schedules;
    BigDecimal pricePerEntry;
    String currency;
}

