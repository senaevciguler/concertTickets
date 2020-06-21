package service;

import model.Ticket;
import repositories.TicketRepository;

import java.util.List;

public class TicketService {
    TicketRepository ticketRepository = new TicketRepository();

    public void create(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    public Ticket findById(Long id) {
        return ticketRepository.findById(id);
    }

    public void update(Ticket ticket) {
        ticketRepository.update(ticket);
    }

    public void delete(Long id) {
        ticketRepository.delete(id);
    }

}
