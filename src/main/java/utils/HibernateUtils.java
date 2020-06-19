package utils;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    private HibernateUtils() {
    }

    ;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL,
                        "jdbc:mysql://localhost:3306/concertticket");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Java2019.");
                settings.put(Environment.DIALECT,
                        "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "false");
                //settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Audience.class);
                configuration.addAnnotatedClass(Ticket.class);
                configuration.addAnnotatedClass(Schedule.class);
                configuration.addAnnotatedClass(Concert.class);

                StandardServiceRegistryBuilder serviceBuilder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(serviceBuilder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    public static Session openSession() {
        return getSessionFactory().openSession();
    }


}
