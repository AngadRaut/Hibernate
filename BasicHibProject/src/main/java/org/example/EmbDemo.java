package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();


        Student student1 = new Student();
        student1.setId(201);
        student1.setName("Akash Kumar");

        Certificate certificate = new Certificate();
        certificate.setCoarse("Back-End Developer");
        certificate.setDuration("6 Month");
        student1.setCert(certificate);

        Student student2 = new Student();
        student2.setId(202);
        student2.setName("Rajesh Tiwari");

        Certificate certificate1 = new Certificate();
        certificate1.setCoarse("Front-End Developer");
        certificate1.setDuration("1 Year");
        student2.setCert(certificate1);


        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        // objects save :
        session.save(student1);
        session.save(student2);


        tx.commit();
        session.close();
        sessionFactory.close();


    }
}
