package com.assignment.springapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Contact {
    private @Id @GeneratedValue Long id;
    private String fullName;
    private String nickName;
    private String title;
    private String company;
    private String email;
    private String phone;
    private String birthday;
    private String note;

    public Contact() {
    }

    public Contact(String fullName, String nickName, String title, String company, String email, String phone, String birthday, String note) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.note = note;
    }
}
