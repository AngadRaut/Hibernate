package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();


        // first question and answer
        // creating Question
        Question question = new Question();
        question.setQuestion_id(1);
        question.setQuestion("What is Java ?");

        Marks marks = new Marks();
        marks.setMarksForEachQ(2);
        marks.setTime("1 min");

        question.setMarks(marks);


        // creating Answer
        Answer answer = new Answer();
        answer.setAnswer_id(11);
        answer.setAnswer("Java is an OOP language");

        question.setAnswer(answer);

        // second question and answer
        // creating Question
        Question question1 = new Question();
        question1.setQuestion_id(2);
        question1.setQuestion("What is Class ?");

        Marks marks1 = new Marks();
        marks1.setMarksForEachQ(2);
        marks1.setTime("1 min");

        question1.setMarks(marks1);

        // creating Answer
        Answer answer1 = new Answer();
        answer1.setAnswer_id(12);
        answer1.setAnswer("Class is an logical entity.");

        question1.setAnswer(answer1);
        // creating session and storing answer and question
        Session session = sessionFactory.openSession();
        session.save(question);
        session.save(answer);

        session.save(question1);
        session.save(answer1);

        Transaction tx = session.beginTransaction();
        tx.commit();


        session.close();
        System.out.println("done...");
    }
}
