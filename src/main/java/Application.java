import model.Audience;
import model.Schedule;
import repositories.AudienceRepository;
import repositories.ScheduleRepository;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        AudienceRepository audienceRepository = new AudienceRepository();
        //audienceRepository.delete((long) 3);
        System.out.println(audienceRepository.findById((long) 1).getFirstName());

        /*Audience audience = new Audience();
        audience.setFirstName("Sena");
        audience.setLastName("Guler");
        audience.setDateOfBirth(new Date());
        audienceRepository.save(audience);

         */

        ScheduleRepository scheduleRepository = new ScheduleRepository();
        Schedule schedule = scheduleRepository.findById((long) 1);
        System.out.println(schedule.getConcert().getConcertCategory());


    }
}

