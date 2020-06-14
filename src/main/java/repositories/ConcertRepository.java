package repositories;

import model.Concert;
import org.hibernate.Session;
import utils.HibernateUtils;

import java.util.List;

public class ConcertRepository {
    public List<Concert> findAll(){
        Session session = HibernateUtils.openSession();
        List<Concert> concerts = session.createQuery("select m from Concert m", Concert.class).getResultList();
        session.close();
        return concerts;
    }


}
