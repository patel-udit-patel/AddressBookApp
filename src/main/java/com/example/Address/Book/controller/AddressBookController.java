package com.example.Address.Book.controller;

import com.example.Address.Book.DTO.AddressBookDTO;
import com.example.Address.Book.repository.AddressBookRepository;
import com.example.Address.Book.model.AddressBookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AddressBookController {

    //UC01_section01
    @GetMapping
    public String welcomeMessage(){
        return "Welcome to Address Book";
    }

    //UC02_section01
    @Autowired
    private AddressBookRepository repository;

    @GetMapping("/api/all")
    public List<AddressBookEntry>getAllInfo(){
        return repository.findAll();
    }

    @GetMapping("/api/{id}")
    public AddressBookEntry getInfoById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
    }

    @PostMapping("/api")
    public AddressBookEntry addInfo(@RequestBody AddressBookDTO dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);

        return data;
    }

    @PutMapping("/api/{id}")
    public AddressBookEntry updateInfo(@PathVariable Long id,@RequestBody AddressBookEntry dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setId(id);
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);
        return data;
    }

    @DeleteMapping("/api/{id}")
    public AddressBookEntry deleteInfo(@PathVariable Long id){
        AddressBookEntry data=repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
         repository.delete(data);
         return data;
    }
    //UC01_section02

    @GetMapping("/all")
    public ResponseEntity<List<AddressBookEntry>>getAllInfoResponse(){
        List<AddressBookEntry> entry = repository.findAll();
        return ResponseEntity.ok(entry);
        }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookEntry> getInfoByIdResponse(@PathVariable Long id) {
        AddressBookEntry entry= repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
        return ResponseEntity.ok(entry);
    }

    @PostMapping
    public ResponseEntity<AddressBookEntry> addInfoResponse(@RequestBody AddressBookDTO dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);

        return ResponseEntity.ok(data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookEntry> updateInfoResponse(@PathVariable Long id,@RequestBody AddressBookEntry dataDTO){
        AddressBookEntry data = new AddressBookEntry();
        data.setId(id);
        data.setName(dataDTO.getName());
        data.setContact(dataDTO.getContact());
        data.setEmail(dataDTO.getEmail());

        repository.save(data);
        return ResponseEntity.ok(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AddressBookEntry> deleteInfoResponse(@PathVariable Long id){
        AddressBookEntry data=repository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
        repository.delete(data);
        return ResponseEntity.ok(data);
    }


}
