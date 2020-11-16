package org.example.repository.service;

import org.example.ClassRoom;
import org.example.Instructor;
import org.example.repository.Classroom.ClassRoomRepository;
import org.example.repository.Classroom.InMemoryClassRoomRepository;
import org.example.repository.ClassroomSpringJpaRepository;
import org.example.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Collections.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookService service;
    private ClassroomSpringJpaRepository repository;
//    private List <ClassRoom> classRooms;

    @BeforeEach
    public void setup() {
        List<ClassRoom> classRooms = new LinkedList<>();  //usuwamy bo moki
        // to bylo w srodku bookservice()-(new InMemoryClassRoomRepository(classRooms)));

        repository = mock(ClassroomSpringJpaRepository.class);//to repozytorium zainicjujemy mokiem, import static metoda mock() w srodku klasa ktora mokujemy
        service = new BookService(repository); //mok wrzucamy do serwisu

    }

    @Test
    public void verifyIfFindByNumberClassroomIsCorrect() {
        int numberToFind = 1;
        List<ClassRoom> classRooms = new LinkedList<>();

        singletonList(new Instructor(null, "Antoni", "Zuter",
                "Wydział Polonistyki", true, classRooms ));

        ClassRoom classRoomToFind = new ClassRoom(
                null, "Sala Testowa", numberToFind,
                20,1,1,1,
                2,true,
                singletonList(new Instructor(null, "Antoni", "Zuter",
                        "Wydział Polonistyki", true, classRooms))
        );
            when(repository.findByNumber(numberToFind))
                    .thenReturn(classRoomToFind);
            verify(repository, times(0)).findByNumber(numberToFind);
        }




}



//
//    @Test
//    public void verifyIfClassroomBookedCorrectly() {
//        //given
//        int numberToBook = 1;
//        ClassRoom classRoomToBook = new ClassRoom("Sala komputerowa", numberToBook, 40, 1, 1, 0, 40, true);
//        service.save(classRoomToBook);
//        //when
//        service.book(numberToBook);
//        //then
//        ClassRoom classRoomAfterBooking = new ClassRoom
//                ("Sala komputerowa", numberToBook, 40, 1, 1, 0, 40, false);
//
//        ClassRoom actualClassroomAfterBooking = service.findByNumber(1);
//
//        Assertions.assertEquals(classRoomAfterBooking, actualClassroomAfterBooking);
//    }
//
//    @Test
//    public void verifyIfClassroomIsNotToBookIfItIsBookedAlready() {   // w run w teście pokazał sie komunikat This classroom is not available- coś chyba nie tak
//        //given
//        int numberToBook = 1;
//        ClassRoom classRoomToBook = new ClassRoom
//                ("Sala komputerowa", numberToBook, 40, 1, 1, 0, 40, false);
//        service.save(classRoomToBook);
//        //when
//        service.book(numberToBook);
//        //then
//        ClassRoom classRoomAfterBooking = new ClassRoom("Sala komputerowa", numberToBook, 40, 1, 1, 0, 40, false);
//
//        ClassRoom actualClassroomAfterBooking = service.findByNumber(numberToBook);
//
//        Assertions.assertEquals(classRoomAfterBooking, actualClassroomAfterBooking);
//    }
//
//    @Test
//    public void verifyIfClassroomDeletedCorrectly() {
//        //given
//        int numberToDeleted = 1;
//        ClassRoom classRoomToAdd = new ClassRoom(
//                "Sala komputerowa", 10, 40,1,1, 0, 40, false );
//        service.save(classRoomToAdd);
//        //when
//        service.delete(numberToDeleted);
//            //then
//
//        ClassRoom deletedClassroom = service.findByNumber(numberToDeleted);
//        ClassRoom expecteddeletedClassRoom = null;
//        Assertions.assertEquals(expecteddeletedClassRoom, deletedClassroom);
//        Assertions.assertNull(deletedClassroom);                        //    nie dziala no value present
//
//        Assertions.assertThrows(
//                NoSuchElementException.class,
//                () -> service.delete(numberToDeleted)
//
//        );
//    }
//
//    @Test
//    public void verifyIfClassroomCantDeleteIfItIsNotExist() {     //   no value present - nie mam pomyslu w mainie jest try catch na nosuchelementexception
//        //given
//        int numberToDeleted = 1;
//        ClassRoom classRoomToAdd = new ClassRoom(
//                "Sala komputerowa", 10, 40,1,1, 0, 40, false );
//        //when
//        service.save(classRoomToAdd);
//        service.delete(numberToDeleted);
//
//        //then
//        Assertions.assertNull(service.findByNumber(numberToDeleted));
//
//        Assertions.assertThrows(
//                NoSuchElementException.class,
//                () -> service.delete(numberToDeleted));
//
//




