package org.example;


import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class SessionFactoryProvider {
    public static SessionFactory sessionFactory;
    public static SessionFactory provideSessionFactory(){
         sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }
}
