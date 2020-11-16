package org.example.service;
/* nie rozumiem dlaczego w kilku klasach są te same metody i w jednych się pisze te wszystkie
ify, a w innych tylko sie zaznacza ze taka metoda jest, to ze jest interfejs i sobie go
implementujemy w innej klasie i przyslaniamy metody to wiem ale co np z bookservice i main
wcześniej zrobilam wszytskie ify w mainie i dzialalo, dalam to do bookservice i nic nie dziala tylko scanner
*/

import org.example.ClassRoom;
import org.example.repository.Classroom.ClassRoomRepository;
import org.example.repository.ClassroomSpringJpaRepository;
import org.example.repository.annotation.HibernateRepository;
import org.example.repository.annotation.InMemoryRepository;
import org.example.repository.annotation.JdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BookService {
    private final ClassroomSpringJpaRepository classRoomRepository;
    private boolean available;

    @Autowired
    public BookService(
             ClassroomSpringJpaRepository classRoomRepository) { // konstruktor usuwamy przy wstrzyknieciu przez pole
        this.classRoomRepository = classRoomRepository;
    }

    public void save(ClassRoom classRoom) {

        classRoomRepository.save(classRoom);
    }

    public ClassRoom findByNumber(int number) {
        if (classRoomRepository.findByNumber(number) == null) {
            throw new NoSuchElementException("Classroom number " + number + " doesn't exist");
        } else {
            return classRoomRepository.findByNumber(number);
        }
    }
//    }
//        try {
//            classRoomRepository.findByNumber(number);
//            System.out.println(classRoomRepository.findByNumber(number));
//        } catch (NoSuchElementException e) {
//            System.out.println("Classroom number " + number + " doesn't exist");
//        }
//
//        return classRoomRepository.findByNumber(number);

//



        public void delete ( int delnumber){
            try {
                classRoomRepository.delete(delnumber);
                System.out.println("Classroom deleted successfully.");
            } catch (NoSuchElementException exception) {
                System.out.println("This classroom is not exist");
            }

        }

        public void book ( int booknumber){
            available = classRoomRepository.findByNumber(booknumber).isAvailable();
            try {
                if (!available) {
                    System.out.println("This classroom is not available");
                }
                if (available) {
                    classRoomRepository.findByNumber(booknumber).setAvailable(false);
                    System.out.println("Classroom booked successfully.");
                }
            } catch (NoSuchElementException exception) {
                System.out.println("This classroom is not exist");
            }
        }
    }
