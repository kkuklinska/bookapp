package org.example.service;

import org.example.controller.dto.ClassroomRequest;
import org.example.controller.dto.ClassroomResponse;
import org.example.repository.entity.Classroom;
import org.example.repository.ClassroomSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClassroomService {
    private final ClassroomSpringJpaRepository classroomRepository;
    private boolean available;
    private final ClassroomMapper mapper;

    @Autowired
    public ClassroomService(
            ClassroomSpringJpaRepository classroomRepository,
            ClassroomMapper mapper
    ) { // konstruktor usuwamy przy wstrzyknieciu przez pole
        this.classroomRepository = classroomRepository;
        this.mapper = mapper;
    }

    public void save(ClassroomRequest classroomRequest) {
        Classroom classroom = mapper.map(classroomRequest);
        classroomRepository.save(classroom);
    }

    public Classroom findByNumber(int number) {
        return classroomRepository.findByNumber(number);
    }

    public ClassroomResponse findResponseByNumber(int number) {
        final Classroom classroom = findByNumber(number);
        return mapper.map(classroom);

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

    public void book(int booknumber) {
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
