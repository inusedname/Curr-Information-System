package com.example.ecommerce.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
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
    @Column(name = "Create")
    private Date create;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "LastLogin")
    private Date lastLogin;
    @Basic
    @Column(name = "Discriminator")
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

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
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
        return id == account.id && Objects.equals(email, account.email) && Objects.equals(username, account.username) && Objects.equals(password, account.password) && Objects.equals(create, account.create) && Objects.equals(name, account.name) && Objects.equals(phone, account.phone) && Objects.equals(lastLogin, account.lastLogin) && Objects.equals(discriminator, account.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, password, create, name, phone, lastLogin, discriminator);
    }
}
