package model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "concert")
public class Concert {
    @Id
    private Long concertId;
    @Enumerated(EnumType.STRING)
    private ConcertCategory concertCategory;
    private String singerName;
    @OneToMany(mappedBy = "concert", fetch = FetchType.EAGER)
    private List<Schedule> schedules;

    public Long getConcertId() {
        return concertId;
    }

    public void setConcertId(Long concertId) {
        this.concertId = concertId;
    }

    public ConcertCategory getConcertCategory() {
        return concertCategory;
    }

    public void setConcertCategory(ConcertCategory concertCategory) {
        this.concertCategory = concertCategory;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertId=" + concertId +
                ", concertCategory=" + concertCategory +
                ", singerName='" + singerName + '\'' +
                ", schedules=" + schedules +
                '}';
    }
}
