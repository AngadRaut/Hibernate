package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Save {
    public static void main(String[] args) {

            Session session = SessionFactoryProvider.provideSessionFactory().openSession();
            District district = new District();
            district.setName("Parbhani");
            district.setState("MAH");
            district.setCode(431509);
            district.setNoOfTaluka(5);

            session.save(district);

            Transaction tx = session.beginTransaction();
            tx.commit();

            session.close();

    }
}
