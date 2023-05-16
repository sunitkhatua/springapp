package com.crud.webDevelopmentSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String address;
    private String communication_history;
    private String purchase_history;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() { return phone; }

    public void setPhone(Long phone) { this.phone = phone; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getCommunication_history() { return communication_history; }

    public void setCommunication_history(String communication_history) { this.communication_history = communication_history; }

    public String getPurchase_history() { return purchase_history; }

    public void setPurchase_history(String purchase_history) { this.purchase_history = purchase_history; }

}