package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "schedule")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDateTime startTime;

}


