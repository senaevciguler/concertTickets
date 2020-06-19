package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "schedules")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDateTime startTime;

}


