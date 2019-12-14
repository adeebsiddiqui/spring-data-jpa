package com.ad.app.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Column(name = "Fname")
    private String firstName;

    @Column(name = "Minit")
    private String middleInitial;

    @Column(name = "Lname")
    private String lastName;

    @Column(name = "Ssn")
    @Id
    private String ssn;

    @Column(name = "Bdate")
    private Date birthDate;

    @Column(name = "Address")
    private String address;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Salary")
    private double salary;

    @Column(name = "Super_ssn")
    private String superSsn;

    @Column(name = "Dno")
    private int departmentNumber;
}
