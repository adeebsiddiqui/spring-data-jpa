package com.ad.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Column(name = "fname")
    private String firstName;

    @Column(name = "minit")
    private String middleInitial;

    @Column(name = "lname")
    private String lastName;

    @Id
    private String ssn;

    @Column(name = "bdate")
    private Date birthDate;

    private String address;

    private String sex;

    private double salary;

    @Column(name = "super_ssn")
    @JsonProperty("super-ssn") private String superSsn;

    @Column(name = "dno")
    @JsonProperty("department-number") private int departmentNumber;
}
