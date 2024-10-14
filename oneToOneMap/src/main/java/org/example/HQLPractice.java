package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLPractice {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();;

        // use WHERE clause
        String hib = "FROM Question a WHERE a.question_id = 2 ";
        Query query = session.createQuery(hib);
        Question q = (Question) query.uniqueResult();
        if(query!=null) {
            System.out.println(q.getQuestion_id() + " " + q.getQuestion());
        }else System.out.println("not found ");


        Transaction tx = session.beginTransaction();
        tx.commit();




        sessionFactory.close();
        session.close();
    }
}
