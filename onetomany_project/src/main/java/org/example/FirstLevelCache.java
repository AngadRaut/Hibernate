package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session s= sessionFactory.openSession();

        Person p = s.get(Person.class,333);
        System.out.println(p.getMob_no());
        System.out.println("working ....");

       Person p1 =  s.get(Person.class,333);
        System.out.println(p1.getFull_name());

        s.close();
        sessionFactory.close();

    }
}
