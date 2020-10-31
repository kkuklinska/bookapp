package org.example.repository;

import org.example.ClassRoom;

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
    public ClassRoom delete(int delnumber) {
        classRooms.remove(findByNumber(delnumber));
        return null;
    }

    @Override
    public ClassRoom book(int number) {
       while(true){
           ClassRoom.isAvailable(false);

        }

        }
    }


