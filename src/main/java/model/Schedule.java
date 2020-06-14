package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "schedules")
@Data
public class Schedule {
    @Id
    Long scheduleId;
    Date startTime;
    @ManyToOne
    @JoinColumn(name = "concertId")
    Concert concert;

}


