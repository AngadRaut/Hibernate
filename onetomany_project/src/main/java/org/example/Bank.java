package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Bank {

    public int getCustomer_id() {
        return customer_id;
    }

    public Bank(int customer_id, String bank_name, String acc_no, String ifsc_code, Person person) {
        this.customer_id = customer_id;
        this.bank_name = bank_name;
        this.acc_no = acc_no;
        this.ifsc_code = ifsc_code;
        this.person = person;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }



    @Id
    private int customer_id;



    @Column(name = "Bank Name")
    private String bank_name;

    @Column(name = "Acc_No")
    private String acc_no;

    @Column(name = "IFSC")
    private String ifsc_code;

    @ManyToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Bank() {
        super();
    }


    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }
}
