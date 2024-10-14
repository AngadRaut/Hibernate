package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();


        Bank b1 = session.get(Bank.class,1);
        System.out.println(b1.getBank_name());
        System.out.println("working");
       Bank b2 =  session.load(Bank.class,1);
        System.out.println(b2.getAcc_no());

        session.close();
        sessionFactory.close();
    }
}
