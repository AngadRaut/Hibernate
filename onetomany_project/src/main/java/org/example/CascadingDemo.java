package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadingDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();



        Person person = new Person();
        person.setAadhar_no(123456780);
        person.setFull_name("AMDAR NAVLE");
        person.setAddress("Pune Shivane");
        person.setMob_no("675334464639");

        Bank bank = new Bank();
        bank.setBank_name("A");
        bank.setCustomer_id(900);
        bank.setAcc_no("886464");
        bank.setIfsc_code("ABC7650");
        bank.setPerson(person);

        Bank bank1 = new Bank();
        bank1.setBank_name("B");
        bank1.setCustomer_id(1000);
        bank1.setAcc_no("7435548346");
        bank1.setIfsc_code("ABC1111");
        bank1.setPerson(person);

        Bank bank2 = new Bank();
        bank2.setBank_name("C");
        bank2.setCustomer_id(1100);
        bank2.setAcc_no("8864345664");
        bank2.setIfsc_code("C0000");
        bank2.setPerson(person);

        Bank bank3 = new Bank();
        bank3.setBank_name("D");
        bank3.setCustomer_id(800);
        bank3.setAcc_no("8864643264");
        bank3.setIfsc_code("D1234");
        bank3.setPerson(person);

        List<Bank> list = new ArrayList<>();
        list.add(bank);
        list.add(bank1);
        list.add(bank2);
        list.add(bank3);

        person.setBankList(list);

        session.save(person);
        session.save(bank);
        session.save(bank1);
        session.save(bank3);
        session.save(bank2);

        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
