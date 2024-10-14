package org.example;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id ;
    private String name;

    public Certificate getCert() {
        return cert;
    }

    public void setCert(Certificate cert) {
        this.cert = cert;
    }

    @Embedded
    private Certificate cert;


    Student(){
        System.out.println();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "Certificate:"+cert+
                '}';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
