package com.example.Address.Book.services;

import com.example.Address.Book.DTO.AddressBookDTO;
import com.example.Address.Book.model.AddressBookEntry;
import com.example.Address.Book.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressBookServices {
    @Autowired
    private AddressBookRepository repository;

    public List<AddressBookEntry> getAllInfo(){
        return repository.findAll();
    }

    public AddressBookEntry getInfoById( Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
    }

    public AddressBookEntry addInfo( AddressBookDTO dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);

        return data;
    }

    public AddressBookEntry updateInfo( Long id, AddressBookEntry dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setId(id);
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);
        return data;
    }

    public AddressBookEntry deleteInfo( Long id){
        AddressBookEntry data=repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
        repository.delete(data);
        return data;
    }

}
