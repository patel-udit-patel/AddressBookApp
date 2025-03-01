package com.example.Address.Book.repository;

import com.example.Address.Book.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository  extends JpaRepository<AddressBookEntry,Long> {
}
