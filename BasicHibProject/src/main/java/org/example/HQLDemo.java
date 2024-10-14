package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory= configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        tx.commit();

        // WHERE clause
        String hib = "FROM Student s WHERE s.id = 101";
        Query query = session.createQuery(hib);
        Student student = (Student) query.uniqueResult();
        System.out.println(student.getCert().getCoarse()+" "+student.getId()+" "+student.getName());


       /* // from clause
        String querry = "from Address";
        Query q = session.createQuery(querry);
        List<Address> address = q.list();
        for(Address ad : address){
            System.out.println(ad.getAddressId());
        }*/





        sessionFactory.close();
        session.close();
    }
}
