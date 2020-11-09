package org.example.repository.Classroom;

import org.example.ClassRoom;

public interface ClassRoomRepository {
    void save (ClassRoom classroom);

    ClassRoom findByNumber(int number);

    void delete(int number);

    void book(int number);

    ClassRoom update(Long id, String name, int number, int seats,
                     int projector, int whiteboard, int blackboard,
                     int speakers, boolean available);
}

