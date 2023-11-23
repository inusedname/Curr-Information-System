package com.example.ecommerce.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@DiscriminatorColumn(name = "Discriminator", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Username")
    private String username;
    @Basic
    @Column(name = "Password")
    private String password;
    @Basic
    @Column(name = "CreatedDate")
    private Date createdDate;
    @Basic
    @Column(name = "Discriminator", insertable = false, updatable = false)
    private String discriminator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(email, account.email) && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(createdDate, account.createdDate) && Objects.equals(discriminator, account.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, password, createdDate, discriminator);
    }
}
