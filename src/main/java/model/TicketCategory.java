package model;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

public enum TicketCategory {
    POP,
    ROCK,
    JAZZ;

    @Id
    Long ticketCategoryId;
    BigDecimal price;

    @OneToMany(mappedBy = "category")
    List<Ticket> ticketList;
}
