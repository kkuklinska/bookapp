package org.example.repository;

import org.example.ClassRoom;

public interface ClassRoomRepository {
    void save (ClassRoom classroom);

    ClassRoom findByNumber(int number);

    ClassRoom delete(int classroom);

    void book(int number);
}

