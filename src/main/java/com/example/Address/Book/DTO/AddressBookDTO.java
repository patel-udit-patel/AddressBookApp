package com.example.Address.Book.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String contact;

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

