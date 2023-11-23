package com.example.ecommerce.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Admin extends Account {
    @Basic
    @Column(name = "LastLogin")
    private Date lastLogin;

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(lastLogin, admin.lastLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastLogin);
    }
}
