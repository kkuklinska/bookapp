package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "users")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Instructor_ID")
    private Long id;
    @Column(name = "Instructor_name")
    String name;
    @Column(name = "Instructor_surname")
    String surname;
    @Column(name = "Department")
    String department;
    @Column(name = "Available")
    boolean available;


    }
