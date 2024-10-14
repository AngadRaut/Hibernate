package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.sql.Date;

@Embeddable
public class Marks {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Column(name = "DateOfExam")
    @Temporal(TemporalType.DATE)
    private Date date ;
    private int marksForEachQ;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMarksForEachQ() {
        return marksForEachQ;
    }

    public void setMarksForEachQ(int marksForEachQ) {
        this.marksForEachQ = marksForEachQ;
    }

    private String  time;


}
