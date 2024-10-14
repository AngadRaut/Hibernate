package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class District {

    @Column(name = "Name Of District")
    private String name;
    private String State;

    @Id
    private int code;
    @Column(name = "No Of Taluka")
    private int noOfTaluka;

    public District(){
        super();
    }
    public District(String name, String state, int code, int noOfTaluka) {
        this.name = name;
        State = state;
        this.code = code;
        this.noOfTaluka = noOfTaluka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNoOfTaluka() {
        return noOfTaluka;
    }

    public void setNoOfTaluka(int noOfTaluka) {
        this.noOfTaluka = noOfTaluka;
    }
}
