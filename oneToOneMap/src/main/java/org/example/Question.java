package org.example;

import jakarta.persistence.*;


@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Question_No")
    private int question_id;

    private String question;

    @OneToOne
    private Answer answer;

    private Marks marks;

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(){
        super();
    }

    public Question(int question_id, String question, Answer answer) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
