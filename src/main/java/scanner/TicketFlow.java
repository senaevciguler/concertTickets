package scanner;

import model.Concert;
import model.Ticket;
import service.ConcertService;
import service.LoginService;

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

    public BigDecimal payToTicket() {
        Ticket ticket = new Ticket();
        Concert concert = new Concert();

        System.out.println("write person amount");
        BigDecimal person = sc.nextBigDecimal();
        System.out.println("please enter your payment:");
        BigDecimal payment = sc.nextBigDecimal();
        BigDecimal totalPrice = ticket.setTotalPrice(concert.getPricePerEntry().multiply(person));
        if (payment.compareTo(totalPrice) == 0) {
            System.out.println("thank you for payment, your ticket number is:" + giveTicketNumber());
        } else if (payment.compareTo(totalPrice) < 0) {
            System.out.println("you should pay more" + totalPrice.subtract(payment));
        } else {
            return payBack(payment, totalPrice);
        }
        return null;
    }

    public BigDecimal payBack(BigDecimal enter, BigDecimal sum) {
        return sum.subtract(enter);
    }

    public String giveTicketNumber() {
        Ticket ticket = new Ticket();
        return ticket.getTicketNumber();
    }
}
















