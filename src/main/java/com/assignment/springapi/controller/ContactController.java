package com.assignment.springapi.controller;

import com.assignment.springapi.model.Contact;
import com.assignment.springapi.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    List<Contact> all() {
        return contactService.findAll();
    }

    @GetMapping("/contacts/{id}")
    Contact one(@PathVariable Long id) {
        return contactService.findById(id);
    }

    @PostMapping("/contacts")
    Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

    @PutMapping("/contacts/{id}")
    Contact update(@RequestBody Contact newContact, @PathVariable Long id) {
        newContact.setId(id);
        return contactService.save(newContact);
    }

    @DeleteMapping("/contacts/{id}")
    void delete(@PathVariable Long id) {
        contactService.deleteById(id);
    }
}
