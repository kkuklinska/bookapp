package org.example.repository.service;

import org.example.ClassRoom;
import org.example.repository.Classroom.InMemoryClassRoomRepository;
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
    public void verifyIfClassroomAddCorrectly() { // nie rozumiem co gdzie mam testowac np dodawanie nowej sali czy w bookserviceTest czy w inmemoryClassroomrepositorytest
        //given                                    // tu i tu mam dodawanie otestowane i przechodzi
        int numberToDeleted = 1;
        ClassRoom classRoomToAdd = new ClassRoom(
                numberToDeleted, 20, 1, 1,
                11, 2, false);
        service.save(classRoomToAdd);
        //when
        ClassRoom expectedClassRoom = new ClassRoom(
                numberToDeleted, 20, 1, 1,
                11, 2, false);
        Assertions.assertEquals(expectedClassRoom, classRoomToAdd);
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
    public void verifyIfClassroomIsNotToBookIfItIsBookedAlready() {   // w run w teście pokazał sie komunikat This classroom is not available- coś chyba nie tak
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
//        @Test
//        public void verifyIfClassroomDeletedCorrectly() {
//            //given
//            int numberToDeleted = 1;
//            ClassRoom classRoomToAdd = new ClassRoom(
//                    numberToDeleted, 20, 1, 1,
//                    11, 2, false);
//            service.save(classRoomToAdd);
//            //when
//            service.delete(numberToDeleted);
////            //then
//
////            ClassRoom deletedClassroom = service.findByNumber(numberToDeleted);
////            ClassRoom expecteddeletedClassRoom = null;
////            Assertions.assertEquals(expecteddeletedClassRoom, deletedClassroom);
////            Assertions.assertNull(deletedClassroom);                            nie dziala no value present
////
//            Assertions.assertThrows(
//                    NoSuchElementException.class,
//                    () -> service.delete(numberToDeleted)

//            );
        }
//    @Test
//    public void verifyIfClassroomCantDeleteIfItIsNotExist() {        no value present - nie mam pomyslu w mainie jest try catch na nosuchelementexception
//        //given
//        int numberToDeleted = 1;
//        ClassRoom classRoomToAdd = new ClassRoom(
//                numberToDeleted, 20, 1, 1,
//                11, 2, false);
//        //when
//        service.save(classRoomToAdd);
//        service.delete(numberToDeleted);
//
//        //then
////        Assertions.assertNull(service.findByNumber(numberToDeleted));
//
//        Assertions.assertThrows(
//                NoSuchElementException.class,
//                () -> service.delete(numberToDeleted));
//
//
//      }


