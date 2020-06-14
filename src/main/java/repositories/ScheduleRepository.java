package repositories;

import model.Schedule;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class ScheduleRepository {
    public List<Schedule> findAll(){
        Session session = HibernateUtils.openSession();
        List<Schedule> schedules = session.createQuery("select m from Schedule m", Schedule.class).getResultList();
        session.close();
        return schedules;
    }
    public Schedule findById(Long id) {
        Session session = HibernateUtils.openSession();
        Schedule schedule = session.find(Schedule.class, id);
        session.close();
        return schedule;
    }

    public void save(Schedule schedule) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(schedule);
        transaction.commit();
        session.close();
    }

    public void delete(Schedule schedule) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(schedule);
        transaction.commit();
        session.close();
    }

    public void delete(Long id) {
        delete(findById(id));
    }

    public void update(Schedule schedule) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(schedule);
        transaction.commit();
        session.close();
    }

}
