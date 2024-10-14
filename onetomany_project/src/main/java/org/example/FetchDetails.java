package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDetails {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();


        Transaction tx = session.beginTransaction();


        Person person = session.get(Person.class,333);
        System.out.println(person);

        Bank b = session.get(Bank.class,2);
        System.out.println(b);

        tx.commit();
        sessionFactory.close();
        session.close();
    }
}
