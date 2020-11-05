package org.example.repository;

import org.example.ClassRoom;
import org.example.Instructor;

public interface InstructorRepository {
    void save (Instructor instructor);

    Instructor findBySurname(String surname);

    void delete(int instructor);

    void set(int number);
}
