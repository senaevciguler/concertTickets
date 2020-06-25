import model.Audience;
import model.Concert;
import model.Schedule;
import model.Ticket;
import scanner.TicketFlow;
import service.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        AudienceService audienceService = new AudienceService();

        Audience audience = new Audience();
        audience.setFirstName("Elif");
        audience.setLastName("Evci");
        audience.setDateOfBirth(LocalDate.of(1965, 8, 15));
        audience.setEmail("elifevci@gmail.com");
        audienceService.create(audience);
        System.out.println(audience);

        //Audience audience = audienceService.findById((long) 1);
        //System.out.println(audience);

        ScheduleService scheduleService = new ScheduleService();
        Schedule schedule = scheduleService.findById((long) 1);
        System.out.println(schedule.getStartTime());

        ConcertService concertService = new ConcertService();
        Concert concert = concertService.findById(2L);
        System.out.println(concert.getConcertCategory());

        concert.setSchedules(List.of(schedule));
        concertService.update(concert);

        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.findById(2L);

        ticket.setAudienceList(List.of(audience));
        ticketService.update(ticket);

        System.out.println(ticket.getAudienceList());

        TicketFlow ticketFlow= new TicketFlow();
        ticketFlow.login();
        ticketFlow.selectConcert(1L);
        ticketFlow.payToTicket();


    }

}