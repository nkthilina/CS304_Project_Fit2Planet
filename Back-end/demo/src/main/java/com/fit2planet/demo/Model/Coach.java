package com.fit2planet.demo.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "coach")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coachId")
    private int coachId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mobileNumber")
    private int mobileNumber;

    @Column(name = "location")
    private String location;

    @Column(name = "yearOfExperience")
    private Integer yearOfExperience;

    @Column(name = "certificates")
    private String certificates;

    @OneToMany(mappedBy = "coach")
    private List<Product> product = new ArrayList<>();

    @OneToMany(mappedBy = "coach")
    private List<Payment> payment = new ArrayList<>();

}
