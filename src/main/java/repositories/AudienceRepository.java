package repositories;

import model.Audience;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class AudienceRepository {
    public List<Audience> findAll() {
        Session session = HibernateUtils.openSession();
        List<Audience> audiences = session.createQuery("select a from audiences a", Audience.class).getResultList();
        session.close();
        return audiences;
    }

    public Audience findById(Long id) {
        Session session = HibernateUtils.openSession();
        Audience audience = session.find(Audience.class, id);
        session.close();
        return audience;

    }

    public List<Audience> findByMail(String mail) {
        Session session = HibernateUtils.openSession();
        List<Audience> audiences = session.createQuery("select a from audience a where a.email = :mail", Audience.class)
                .setParameter("mail", mail).getResultList();
        session.close();
        return audiences;
    }

    public Long save(Audience audience) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(audience);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Audience audience) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(audience);
        transaction.commit();
        session.close();
    }

    public void delete(Long id) {
        delete(findById(id));
    }

    public void update(Audience audience) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(audience);
        transaction.commit();
        session.close();
    }

}
