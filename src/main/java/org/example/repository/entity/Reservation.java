package org.example.repository.entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Reservation {
    @OneToMany
    Classroom classroom;
    @OneToMany
    Instructor instructor;

}
