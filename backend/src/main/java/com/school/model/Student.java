package com.school.model;

import com.school.model.enums.Gender;

import java.util.Date;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;

@Entity(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long  id ;

    @Column(name="fullName")
    private String fullName ;

    @Column(name="phone")
    private String phone;

    @Column(name="age")
    private String age;

    @Column(name="address")
    private String  address;

    @CreationTimestamp
    @Column(name = "date_created")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "date_updated")
    private Date dateUpdated;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;




}
