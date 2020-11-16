package org.example.repository.Classroom;

import org.example.ClassRoom;
import org.example.repository.annotation.InMemoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;


public class InMemoryClassRoomRepository implements ClassRoomRepository {

    private List<ClassRoom> classRooms;


    public InMemoryClassRoomRepository(List<ClassRoom> classRooms) { // konstruktor zeby zainicjalizowac set
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
            throw new NoSuchElementException ("There is no classrooms in base.");

        }

    }


    @Override
    public ClassRoom update(Long id, String name, int number, int seats,
                            int projector, int whiteboard, int blackboard,
                            int speakers, boolean available ) {
        ClassRoom classRoom = classRooms.
                stream().
                filter(classRooms -> classRooms.getNumber() == number).
                findFirst().
                get();

        classRoom.setAvailable(available);
        classRoom.setBlackboard(blackboard);
        classRoom.setName(name);
        classRoom.setProjector(projector);
        classRoom.setSeats(seats);
        classRoom.setSpeakers(speakers);
        return classRoom;
    }
}





