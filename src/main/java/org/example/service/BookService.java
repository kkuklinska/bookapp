package org.example.service; //???

import org.example.ClassRoom;
import org.example.repository.ClassRoomRepository;

public class BookService {
    private final ClassRoomRepository classRoomRepository;

    public BookService(ClassRoomRepository classRoomRepository) { // konstruktor
        this.classRoomRepository = classRoomRepository;
    }

    public void save(ClassRoom classRoom) {
        classRoomRepository.save(classRoom);
    }

    public ClassRoom findByNumber(int number) {
        return classRoomRepository.findByNumber((number));
    }

    public ClassRoom delete(int delnumber) {
        classRoomRepository.delete(delnumber);
        return classRoomRepository.delete(delnumber);
    }

    public void book(int booknumber) {
        if (ClassRoom.getAvailable() == true) {
            classRoomRepository.findByNumber((booknumber)).setAvailable(false);

        } else {
            System.out.println("This classroom is not available");
        }

    }
}
