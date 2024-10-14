package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("project started...");

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        // creating object of Student class
        Student obj = new Student(101 ,"Govind");

        // creating object of Address class
        Address ad = new Address();
        ad.setAddressId(5313);
        ad.setStreet("street_1");
        ad.setCity("Pune");
        ad.setIsOpen(true);
        ad.setX(100000.00);
        ad.setAddedDate(new Date());

      /*  // Reading image
        FileInputStream fileInputStream = new FileInputStream("src.main.java.pic.png");
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read();
        ad.setImage(data);*/

        System.out.println(obj);
        Session session = sessionFactory.openSession();
        session.save(obj);
        session.save(ad);
        System.out.println("done...");

        Transaction tx = session.beginTransaction();
        tx.commit();

        session.close();
        sessionFactory.close();

    }
}
