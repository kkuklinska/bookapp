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
        return classRoomRepository.delete((delnumber));
    }
    public ClassRoom book(int booknumber) {
        return classRoomRepository.findByNumber((booknumber));
    }
}
