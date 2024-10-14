package org.example;

import org.hibernate.Session;
import org.hibernate.cache.internal.DisabledCaching;

public class Retrieve {
    public static void main(String[] args) {
        Session session = SessionFactoryProvider.provideSessionFactory().openSession();
        District district = session.load(District.class,431509);
        System.out.println(district.getClass());
        System.out.println(district.getName()+":"+district.getCode()+","+ district.getNoOfTaluka()+","+district.getState());

        session.close();
    }
}
