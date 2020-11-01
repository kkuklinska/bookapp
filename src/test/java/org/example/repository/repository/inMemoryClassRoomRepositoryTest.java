package org.example.repository.repository;

import org.example.ClassRoom;
import org.example.repository.InMemoryClassRoomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.Set;

public class inMemoryClassRoomRepositoryTest {
    private InMemoryClassRoomRepository repository;  //pole
    private Set<ClassRoom> classRooms;

    @BeforeEach
    public void setup(){   //mimo ze mamy w klasie seta i repository to i tak przed testem trzeba tak jakby w metodzie?
        classRooms = new HashSet<>();
        repository = new InMemoryClassRoomRepository(classRooms);        // to ten set
    }

    @Test
    public void verifyIfClassroomAddingCorrectly(){
//given
        ClassRoom classRoom = new ClassRoom(
                1, 20, 1, 1,
                11, 2, true);
        ClassRoom expectedClassRoom = new ClassRoom(
                1, 20, 1, 1,
                11, 2, true);
        //when
        repository.save(classRoom);
        //then
        ClassRoom actualClassroom = classRooms.stream().findFirst().get();
        assertEquals(expectedClassRoom,actualClassroom);
    }

}
