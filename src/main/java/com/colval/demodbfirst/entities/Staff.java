package com.colval.demodbfirst.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "adress_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "picture")
    private long picture;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store store;

    @Column(name = "active")
    private Byte active;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;

    public long getStaffId() {
        return this.staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddressId() {
        return this.address;
    }

    public void setAddressId(Address address) {
        this.address = address;
    }

    public long getPicture() {
        return this.picture;
    }

    public void setPicture(long picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Store getStoreId() {
        return this.store;
    }

    public void setStoreId(Store store) {
        this.store = store;
    }

    public Byte getActive() {
        return this.active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", picture=" + picture +
                ", email='" + email + '\'' +
                ", store=" + store +
                ", active=" + active +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
