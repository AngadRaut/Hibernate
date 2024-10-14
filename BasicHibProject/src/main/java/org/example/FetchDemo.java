package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.internal.TransactionImpl;


// practical session about entity life cycle
// transient
// persistence
// detached
// removed


public class FetchDemo {
    public static void main(String[] args) {
        // create configuration
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

       /* // student info using get() method
       Student student =  session.get(Student.class,102);
       System.out.println(student.getName());*/


        // create student obj and setting its properties
        Student student = new Student();
        student.setName("ABC");
        student.setId(777);
        student.setCert(new Certificate("Java Developer","1.5 Month"));
        // it is in transient state as it is not associate to database and session object

        Session session = sessionFactory.openSession();
        session.save(student);
        // it goes into the persistence state
        // now it is connected to database and associated to database and session object
        // changing the name it will change in database

        student.setName("Nana");


       /*// printing address info using get() method
        Address address = session.get(Address.class,1);
        System.out.println(address.toString());*/


        Transaction tx = session.beginTransaction();
        tx.commit();

        session.close();
        student.setName("Nana Patekar");

        sessionFactory.close();

    }
}
