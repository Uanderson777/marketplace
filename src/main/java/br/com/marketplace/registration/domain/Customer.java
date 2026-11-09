package br.com.marketplace.registration.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import java.util.UUID;

@Entity
public class Customer {

    @EmbeddedId
    private CustomerId id;

    private String name;

    private String email;

    protected Customer() {
    }

    public Customer(String name, String email) {
        this.id = new CustomerId(UUID.randomUUID());
        this.name = name;
        this.email = email;
    }

    public CustomerId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
