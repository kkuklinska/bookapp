package org.example.repository;

import org.example.ClassRoom;

public interface ClassRoomRepository {
    void save (ClassRoom classroom);

    ClassRoom findByNumber(int number);

    void delete(int classroom);

    void book(int number);
}

