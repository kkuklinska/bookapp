package org.example.service;

import org.example.repository.entity.Classroom;
import org.example.repository.ClassroomSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BookService {
    private final ClassroomSpringJpaRepository classroomRepository;
    private boolean available;

    @Autowired
    public BookService(
             ClassroomSpringJpaRepository classroomRepository) { // konstruktor usuwamy przy wstrzyknieciu przez pole
        this.classroomRepository = classroomRepository;
    }

    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    public Classroom findByNumber(int number) {
        return classroomRepository.findByNumber(number);
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



//        public void delete ( int number){
//            classRoomRepository.delete(number);
//
//        }

        public void book ( int booknumber){
            available = classroomRepository.findByNumber(booknumber).isAvailable();
            try {
                if (!available) {
                    System.out.println("This classroom is not available");
                }
                if (available) {
                    classroomRepository.findByNumber(booknumber).setAvailable(false);
                    System.out.println("Classroom booked successfully.");
                }
            } catch (NoSuchElementException exception) {
                System.out.println("This classroom is not exist");
            }
        }
    }
