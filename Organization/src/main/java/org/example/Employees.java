package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Employees {
    @Id
    private int aadhar_no;
    private String full_name;
    private String email;
    private long phone_no;
    private String department;

    @ManyToMany
    private List<Projects> projects;

    Employees (){
        super();
    }

    public int getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(int aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employees(int aadhar_no, String full_name, String email,
                     long phone_no, String department, List<Projects> projects) {
        this.aadhar_no = aadhar_no;
        this.full_name = full_name;
        this.email = email;
        this.phone_no = phone_no;
        this.department = department;
        this.projects = projects;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }




}
