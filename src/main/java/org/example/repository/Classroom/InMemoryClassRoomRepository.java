package org.example.repository.Classroom;

import org.example.ClassRoom;
import org.example.repository.Classroom.ClassRoomRepository;

import java.util.Optional;
import java.util.Set;

public class InMemoryClassRoomRepository implements ClassRoomRepository {

    private Set<ClassRoom> classRooms;

    public InMemoryClassRoomRepository(Set<ClassRoom> classRooms) { // konstruktor zeby zainicjalizowac set
        this.classRooms = classRooms;
    }


    @Override
    public void save(ClassRoom classroom) {
        classRooms.add(classroom);

    }

    @Override
    public ClassRoom findByNumber(int number) {
        return classRooms.
                stream().
                filter(classRooms -> classRooms.getNumber() == number).
                findFirst().
                get();

    }

    @Override
    public void delete(int delnumber) {
        classRooms.remove(findByNumber(delnumber));

    }

    @Override
    public void book(int number) {
        Optional<ClassRoom> first = classRooms.stream().filter(classRoom -> classRoom.getNumber() == number).
                findFirst();
        first.
                ifPresent(classRoom -> classRoom.setAvailable(false));
        if (classRooms.isEmpty()) {
            System.out.println("");

        }

    }
    }





