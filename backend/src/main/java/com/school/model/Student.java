package com.school.model;

import com.school.enums.Gender;

import java.util.Date;
import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
