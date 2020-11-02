package org.example.service;
/* nie rozumiem dlaczego w kilku klasach są te same metody i w jednych się pisze te wszystkie
ify, a w innych tylko sie zaznacza ze taka metoda jest, to ze jest interfejs i sobie go
implementujemy w innej klasie i przyslaniamy metody to wiem ale co np z bookservice i main */

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

    public void delete(int delnumber) {
        classRoomRepository.delete(delnumber);
    }

    public void book(int booknumber) {
        if (ClassRoom.getAvailable() == true) {
            classRoomRepository.findByNumber((booknumber)).setAvailable(false);
        } else {
            System.out.println("This classroom is not available");
        }

    }
}
