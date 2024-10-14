package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Session session = SessionFactoryProvider.provideSessionFactory().openSession();

        District district = session.load(District.class,431509);
        session.delete(district);
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
    }
}
