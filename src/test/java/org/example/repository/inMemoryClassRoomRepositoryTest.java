package org.example.repository;

import org.example.ClassRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void test(){

    }
}
