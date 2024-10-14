package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Start...." );

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employees e1 = new Employees();
        e1.setAadhar_no(773622939);
        e1.setFull_name("Kamal Hasan");
        e1.setEmail("kamalhasan@344");
        e1.setPhone_no(885639333);
        e1.setDepartment("Hr Department");

        Employees e2 = new Employees();
        e2.setAadhar_no(738393452);
        e2.setFull_name("Jyoti Hake");
        e2.setEmail("hake@344");
        e2.setPhone_no(345679754);;
        e2.setDepartment("Team Lead / Sr.Developer");

        Employees e3 = new Employees();
        e3.setAadhar_no(98634375);
        e3.setFull_name("Nana Patekar");
        e3.setEmail("nana@34644");
        e3.setPhone_no(5423111);;
        e3.setDepartment("Jr Developer");

        Employees e4 = new Employees();
        e4.setAadhar_no(654783958);
        e4.setFull_name("Utkarsha Rathi");
        e4.setEmail("rathiUtk@344");
        e4.setPhone_no(821139333);;
        e4.setDepartment("Front End Developer");

        Employees e5 = new Employees();
        e5.setAadhar_no(876437373);
        e5.setFull_name("Rampal Yadav Hasan");
        e5.setEmail("yadav@0004");
        e5.setPhone_no(760009987);;
        e5.setDepartment("Jr Developer");

        // projects
        Projects p1 = new Projects();
        p1.setProject_name("Online Banking");
        p1.setDuration("1 Year");
        List<Employees> pro1Emp = new ArrayList<>();
        pro1Emp.add(e1);
        pro1Emp.add(e2);
        pro1Emp.add(e3);
        pro1Emp.add(e4);
        p1.setEmployees(pro1Emp);

        Projects p2 = new Projects();
        p2.setProject_name("Online Ticket Booking");
        p2.setDuration("6 Months");
        List<Employees> pro2Emp = new ArrayList<>();
        pro2Emp.add(e1);
        pro2Emp.add(e5);
        pro2Emp.add(e4);
        p2.setEmployees(pro2Emp);

        Projects p3 = new Projects();
        p3.setProject_name("College Website Design");
        p3.setDuration("3 Years");
        List<Employees> pro3Emp = new ArrayList<>();
        pro3Emp.add(e2);
        pro3Emp.add(e5);
        p3.setEmployees(pro3Emp);

        Projects p4 = new Projects();
        p4.setProject_name("Hotel Management");
        p4.setDuration("3 Months");
        List<Employees> pro4Emp = new ArrayList<>();
        pro4Emp.add(e2);
        pro4Emp.add(e4);

        // employees and their projects
        List<Projects> emp1ProjectList = new ArrayList<>();
        emp1ProjectList.add(p1);
        emp1ProjectList.add(p2);
        e1.setProjects(emp1ProjectList);

        List<Projects> emp2ProjectList = new ArrayList<>();
        emp2ProjectList.add(p1);
        emp2ProjectList.add(p3);
        emp2ProjectList.add(p4);
        e2.setProjects(emp2ProjectList);

        List<Projects> emp3ProjectList = new ArrayList<>();
        emp3ProjectList.add(p1);
        e3.setProjects(emp3ProjectList);

        List<Projects> emp4ProjectList = new ArrayList<>();
        emp4ProjectList.add(p1);
        emp4ProjectList.add(p2);
        emp4ProjectList.add(p4);
        List<Projects> emp5ProjectList = new ArrayList<>();
        emp5ProjectList.add(p2);
        emp5ProjectList.add(p3);

        session.save(e1);session.save(e2);
        session.save(e3);session.save(e4);
        session.save(e5);

        session.save(p1);session.save(p2);
        session.save(p3);session.save(p4);


        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println( "Done" );
    }
}
