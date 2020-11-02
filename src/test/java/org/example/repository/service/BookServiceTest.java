package org.example.repository.service;

import org.example.ClassRoom;
import org.example.repository.InMemoryClassRoomRepository;
import org.example.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class BookServiceTest {

private BookService service;
    private InMemoryClassRoomRepository repository;  //pole
    private Set<ClassRoom> classRooms;

    @BeforeEach
    public void setup(){
        HashSet<ClassRoom> classRooms = new HashSet<>();
        service = new BookService(new InMemoryClassRoomRepository(classRooms));
    }
    @Test
    public void verifyIfClassroomBookedCorrectly(){
        //given
        int numberToBook = 1;
        ClassRoom classRoomToBook = new ClassRoom(
                numberToBook, 20, 1, 1,
                11, 2, true);
        service.save(classRoomToBook);
        //when
        service.book(numberToBook);
        //then
         ClassRoom classRoomAfterBooking = new ClassRoom(
                        numberToBook, 20, 1, 1,
                        11, 2, false);

        ClassRoom actualClassroomAfterBooking = service.findByNumber(1);

        Assertions.assertEquals(classRoomAfterBooking, actualClassroomAfterBooking);
    }
    @Test
    public void verifyIfClassroomNotBookedIfItIsBookedAlreadyNow(){
        //given
        int numberToBook = 1;
        ClassRoom classRoomToBook = new ClassRoom(
                numberToBook, 20, 1, 1,
                11, 2, false);
        service.save(classRoomToBook);
        //when
        service.book(numberToBook);
        //then
        ClassRoom classRoomAfterBooking = new ClassRoom(
                numberToBook, 20, 1, 1,
                11, 2, false);

        ClassRoom actualClassroomAfterBooking = service.findByNumber(1);

        Assertions.assertEquals(classRoomAfterBooking, actualClassroomAfterBooking);
    }
    }

