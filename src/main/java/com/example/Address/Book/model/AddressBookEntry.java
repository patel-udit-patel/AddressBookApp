package com.example.Address.Book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
public class AddressBookEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String contact;

    public AddressBookEntry(){}
    public AddressBookEntry(String fullName,String address,String city,String state,String zipCode,String contact){
        this.fullName=fullName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.contact=contact;
    }
    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContact() {
        return contact;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getState(){
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
