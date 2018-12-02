package com.assignment.springapi;

import com.assignment.springapi.model.Contact;
import com.assignment.springapi.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DatabasePreload {
    @Bean
    CommandLineRunner initDatabase(ContactService contactService) {
        return args -> {
            log.info("Load contact" + contactService.save(new Contact("John", "Doe", "Manager", "Ant", "johndoe@abc.com", "0988777666", "14/03/1993", "")));
            log.info("Load contact" + contactService.save(new Contact("Anna", "Carpenter", "Customer success", "Eagle", "anna.carpenter@abc.com", "0358893388", "21/07/1990", "Some notes")));
        };
    }
}
