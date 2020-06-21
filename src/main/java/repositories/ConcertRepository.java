package repositories;

import model.Concert;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class ConcertRepository {
    public List<Concert> findAll() {
        Session session = HibernateUtils.openSession();
        List<Concert> concerts = session.createQuery("select c from concert c", Concert.class).getResultList();
        session.close();
        return concerts;
    }

    public Concert findById(Long id) {
        Session session = HibernateUtils.openSession();
        Concert concert = session.find(Concert.class, id);
        session.close();
        return concert;
    }

    public void save(Concert concert) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(concert);
        transaction.commit();
        session.close();
    }

    public void delete(Concert concert) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(concert);
        transaction.commit();
        session.close();
    }

    public void delete(Long id) {
        delete(findById(id));
    }

    public void update(Concert concert) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(concert);
        transaction.commit();
        session.close();
    }

}
