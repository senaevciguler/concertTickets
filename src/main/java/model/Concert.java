package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "concert")
@Data
public class Concert {
    @Id
    Long concertId;
    ConcertCategory concertCategory;
    String singerName;
    @OneToMany(mappedBy = "concert", fetch = FetchType.EAGER)
    List<Schedule> scheduleList;
}
