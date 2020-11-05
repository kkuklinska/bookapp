package org.example.repository;

import org.example.Instructor;

import java.util.Set;

public class InMemoryInstructorRepository implements InstructorRepository {
    private Set<Instructor> instructors;

    public InMemoryInstructorRepository(Set<Instructor> instructors) {
        this.instructors = instructors;
    }

    @Override
    public void save(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public Instructor findBySurname(String surname) {
        return instructors.stream().filter(instructors-> instructors.getName() == surname).findFirst().get();
    }

    @Override
    public void delete(int instructor) {
    instructors.remove(instructor);
    }

    @Override
    public void set(int number) {

    }
}
