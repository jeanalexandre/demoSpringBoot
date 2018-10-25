package com.example.demo.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription {
    @Id
    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "newsletter", nullable = false)
    private String newsletter;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }
}
