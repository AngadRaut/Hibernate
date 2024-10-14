package org.example;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Person {

    @Id
    private long aadhar_no;

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    @Column(name = "Name_of_Person")
    private String full_name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Mobile_No")
    private String mob_no;

    @OneToMany
    @Column(name = "Banks")
    private List<Bank> bankList;

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }

    public Person(){
        super();
    }

    public Person(long aadhar_no, String full_name, String address, String mob_no, List<Bank> bankList) {
        this.aadhar_no = aadhar_no;
        this.full_name = full_name;
        this.address = address;
        this.mob_no = mob_no;
        this.bankList = bankList;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }
}
