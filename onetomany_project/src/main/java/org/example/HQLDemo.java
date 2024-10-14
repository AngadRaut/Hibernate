package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLDemo {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        String hib = "UPDATE Bank set name = :a WHERE name = 'SBI'";
        Query query = session.createQuery(hib);
        query.setParameter("a", "NANA PATEKAR BANK");
        int result = query.executeUpdate();
        System.out.println(result + " rows affected.");


        session.close();
        sessionFactory.close();
    }
}
