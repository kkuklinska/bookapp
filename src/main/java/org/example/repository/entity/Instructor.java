package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private String name;
    @Column(name = "Instructor_surname")
    private String surname;
    @Column(name = "Department")
    private String department;
    @Column(name = "Available")
    private boolean available;
    @OneToMany
    private List<Reservation> reservations_instr;

}

//
//    }
