package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDateTime startTime;
    String name;
}


