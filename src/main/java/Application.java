import model.Audience;
import model.Concert;
import model.Schedule;
import model.Ticket;
import repositories.AudienceRepository;
import repositories.ConcertRepository;
import repositories.ScheduleRepository;
import repositories.TicketRepository;
import service.LoginService;

import javax.sound.sampled.AudioInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Application {
    public static void main(String[] args) {

        AudienceRepository audienceRepository = new AudienceRepository();
        //audienceRepository.delete((long) 3);
        Audience audience = audienceRepository.findById((long) 1);
        System.out.println(audience);

        /*Audience audience = new Audience();
        audience.setFirstName("Sena");
        audience.setLastName("Guler");
        audience.setDateOfBirth(new Date());
        audienceRepository.save(audience);

         */

        ScheduleRepository scheduleRepository = new ScheduleRepository();
        Schedule schedule = scheduleRepository.findById((long) 1);
        System.out.println(schedule.getStartTime());


        ConcertRepository concertRepository = new ConcertRepository();
        Concert concert = concertRepository.findById((long) 2);
        System.out.println(concert.getConcertCategory());


        concert.setSchedules(Set.of(schedule));
        concertRepository.update(concert);

        TicketRepository ticketRepository = new TicketRepository();
        Ticket ticket = ticketRepository.findById((long) 2);

        ticket.setAudienceList(Set.of(audience));
        ticketRepository.update(ticket);

        System.out.println(ticket.getAudienceList());

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your email");

        LoginService loginService = new LoginService();
        loginService.isLoginSuccesful(sc.nextLine());
    }

}
