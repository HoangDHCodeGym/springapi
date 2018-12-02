package com.assignment.springapi.service;

import com.assignment.springapi.model.Contact;

import java.util.List;

public interface ContactService {
    Contact findById(Long id);
    List<Contact> findAll();
    Contact save(Contact contact);
    void deleteById(Long id);
}
