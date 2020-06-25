package model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String ticketNumber;
    @OneToOne
    Concert concert;
    @OneToMany
    List<Audience> audienceList;
    BigDecimal totalPrice;
    String currency;

    public BigDecimal setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return totalPrice;
    }
}
