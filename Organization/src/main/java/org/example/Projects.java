package org.example;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Projects {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int project_id;
    private String project_name;

    @Transient
    private Date start_date;
    private String duration;
    @ManyToMany
    private List<Employees> employees;

    Projects(){
        super();
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public Projects(int project_id, String project_name,
                    Date start_date, String duration, List<Employees> employees) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.start_date = start_date;
        this.duration = duration;
        this.employees = employees;
    }
}
