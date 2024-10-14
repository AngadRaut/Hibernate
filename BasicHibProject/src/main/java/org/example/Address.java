package org.example;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table (name = "student_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_Id")
    private int addressId;

    @Column(length = 50)
    private String street;

    @Column(length = 50)
    private String city;

    private boolean isOpen;

//    @Transient
    private double x;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;

    Address(){
        super();
    }
    Address(int addressId,String street,String city,boolean isOpen,
            double x,Date addedDate,byte[] image){
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen=isOpen;
        this.x=x;
        this.addedDate=addedDate;
        this.image=image;
    }
    public void setImage(byte[] image){
        this.image = image;
    }
    public byte[] getImage(){
        return image;
    }

    public void setAddedDate(Date addedDate){
        this.addedDate = addedDate ;
    }
    public Date getAddedDate(){
        return addedDate;
    }

    public void setX(double x){
        this.x = x ;
    }
    public double getX(){
        return x;
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen ;
    }
    public boolean getIsOpen(){
        return isOpen;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setAddressId(int addressId){
        this.addressId = addressId;
    }
    public int getAddressId(){
        return addressId;
    }
    public void setStreet(String street){
        this.street = street ;
    }
    public String  getStreet(){
        return street;
    }
}
