package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();


        Animal animal = new Animal(11,"Dog","Domestic","Black",9);
        Animal animal2 = new Animal(12,"Cat","Domestic","White",2);
        Animal animal3 = new Animal(13,"Tiger","Wild","ORANGE WITH BLACK OR BROWN STRIPES",14);
        Animal animal4 = new Animal(14,"Dear","Wild"," red and brown,",2);

        session.save(animal);
        session.save(animal2);
        session.save(animal3);
        session.save(animal4);

        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        sessionFactory.close();

    }
}
