package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start" );

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Person person = new Person();
        person.setFull_name("Manoj Gangadhar Marwadi");
        person.setAddress("At post pune dist.tq. Pune");
        person.setMob_no("7218997211");
        person.setAadhar_no(333);

        Bank bank = new Bank();
        bank.setBank_name("SBI");
        bank.setIfsc_code("SBIN001234");
        bank.setAcc_no("12345678901");
        bank.setCustomer_id(1);
        bank.setPerson(person);


        Bank bank1 = new Bank();
        bank1.setBank_name("HDFC");
        bank1.setIfsc_code("HDFC9089");
        bank1.setAcc_no("89076524233");
        bank1.setCustomer_id(2);
        bank1.setPerson(person);


        Bank bank2 = new Bank();
        bank2.setBank_name("KOTAK");
        bank2.setIfsc_code("KOTAK45612");
        bank2.setAcc_no("757646638395");
        bank2.setCustomer_id(3);
        bank2.setPerson(person);

        List<Bank> list = new ArrayList<>();
        list.add(bank1);
        list.add(bank);
        list.add(bank2);


        // setting/banks in  persons bankList variable
        person.setBankList(list);

        Session session = sessionFactory.openSession();
        session.save(person);
        session.save(bank);session.save(bank1);session.save(bank2);

        Transaction tx = session.beginTransaction();
        tx.commit();


        sessionFactory.close();
        session.close();
        System.out.println( "done..." );
    }
}
