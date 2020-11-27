//package org.example.repository.repository;
//
//import org.example.repository.entity.ClassRoom;
//import org.junit.jupiter.api.BeforeEach;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.*;
//
//public class inMemoryClassRoomRepositoryTest {
//    private InMemoryClassRoomRepository repository;  //pole
//    private Set<ClassRoom> classRooms;
//
//    @BeforeEach
//    public void setup() {   //mimo ze mamy w klasie seta i repository to i tak przed testem trzeba tak jakby w metodzie?
//       List<ClassRoom> classRooms = new LinkedList<>();
//        repository = new InMemoryClassRoomRepository((List<ClassRoom>) classRooms);        // to ten set
//    }//
//    @Test
//    public void verifyIfClassroomAddingCorrectly(){
////given
//        ClassRoom classRoom = new ClassRoom(
//                "Sala komputerowa", 10, 40,1,1, 0, 40, false );
//        ClassRoom expectedClassRoom = new ClassRoom(
//                "Sala komputerowa", 10, 40,1,1, 0, 40, false );
//        //when
//        repository.save(classRoom);
//        //then
//        ClassRoom actualClassroom = classRooms.stream().findFirst().get();
//        assertEquals(expectedClassRoom,actualClassroom);
//    }
//
//}

//    @Test
//    public void verifyIfClassroomAddCorrectly() { // nie rozumiem co gdzie mam testowac np dodawanie nowej sali czy w bookserviceTest czy w inmemoryClassroomrepositorytest
//        //given                                    // tu i tu mam dodawanie otestowane i przechodzi
//        int numberToDeleted = 1;
//        List<ClassRoom> classRooms = new LinkedList<>();
//        singletonList(new Instructor(null, "Antoni", "Zuter", "Wydział Polonistyki", true, classRooms ));
//
//        ClassRoom classRoomToAdd = new ClassRoom(
//                null, "Sala Testowa", 25,
//                20,1,1,1,
//                2,true,
//                singletonList(new Instructor(null, "Antoni", "Zuter",
//                        "Wydział Polonistyki", true, classRooms))
//        );
//
//        when(repository.save(classRoomToAdd)).
//                //when
//                ClassRoom expectedClassRoom = new ClassRoom(null, "Sala Testowa", 25, 20,1,
//                1,1, 2,true,
//                singletonList(new Instructor(null, "Antoni", "Zuter",
//                        "Wydział Polonistyki", true, classRooms ))
//        );
//
//        Assertions.assertEquals(expectedClassRoom, classRoomToAdd);
//    }
