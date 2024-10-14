package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        Session session = SessionFactoryProvider.provideSessionFactory().openSession();
        District district = session.get(District.class,431509);
        district.setName("Sambhaji-Nagar");
        session.update(district);
        Transaction tx = session.beginTransaction();
        tx.commit();

        session.close();
    }
}
