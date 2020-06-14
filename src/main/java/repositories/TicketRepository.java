package repositories;

import model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class TicketRepository {

    public List<Ticket> findAll(){
        Session session = HibernateUtils.openSession();
        List<Ticket> tickets = session.createQuery("select t from Ticket t", Ticket.class).getResultList();
        session.close();
        return tickets;
    }
    public Ticket findById(Long id) {
        Session session = HibernateUtils.openSession();
        Ticket ticket = session.find(Ticket.class, id);
        session.close();
        return ticket;
    }

    public void save(Ticket ticket) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(ticket);
        transaction.commit();
        session.close();
    }

    public void delete(Ticket ticket) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(ticket);
        transaction.commit();
        session.close();
    }

    public void delete(Long id) {
        delete(findById(id));
    }

    public void update(Ticket ticket) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(ticket);
        transaction.commit();
        session.close();
    }

}
