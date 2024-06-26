package com.example.appventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierid;
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
    @Column(name="homepage")
    private String homepage;

    public Supplier(String homepage) {
        this.homepage = homepage;
    }
}
