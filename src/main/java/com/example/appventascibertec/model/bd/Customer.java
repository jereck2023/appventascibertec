package com.example.appventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerid;
    @Column(name="companyname")
    private String companyname;
    @Column(name="contactname")
    private String contactname;
    @Column(name="contacttitle")
    private String contacttitle;
    @Column(name="adrees")
    private String adrees;
    @Column(name="city")
    private String city;
    @Column(name="region")
    private String region;
    @Column(name="postalcode")
    private String postalcode;
    @Column(name="country")
    private String country;
    @Column(name="phone")
    private String phone;
    @Column(name="fax")
    private String fax;
}
