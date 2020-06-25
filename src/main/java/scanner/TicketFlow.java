package scanner;
import model.Concert;
import model.Ticket;
import service.ConcertService;
import service.LoginService;
import service.TicketService;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class TicketFlow {
    private Map<Ticket, Integer> productStock;
    Scanner sc = new Scanner(System.in);
    public void login() {
        LoginService loginService = new LoginService();
        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.println("please enter your email");
            loginSuccess = loginService.isLoginSuccesful(sc.nextLine());
        }
    }

    public void selectConcert(Long id) {
        ConcertService concertService = new ConcertService();
        System.out.println("please select id from concertList");
        System.out.println(concertService.findAll());
        Long selected = sc.nextLong();
        System.out.println(concertService.findById(selected));

    }

    public void payToTicket() {
        System.out.println("write person amount");
        BigDecimal person = sc.nextBigDecimal();
        Ticket ticket = new Ticket();
        Concert concert = new Concert();
        ticket.setTotalPrice(concert.getPricePerEntry().multiply(person));

    }

    public void giveTicketNumber() {

    }
}
















