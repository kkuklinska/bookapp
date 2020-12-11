package org.example.service;
import org.springframework.stereotype.Component;

import org.example.controller.dto.ClassroomRequest;
import org.example.controller.dto.ClassroomResponse;
import org.example.repository.entity.Classroom;
import org.example.repository.entity.Reservation;


import java.util.stream.Collectors;

@Component
public class ClassroomMapper {
    public ClassroomResponse map(Classroom classroom){
       return ClassroomResponse
                .builder()
                .id(classroom.getId())
                .name(classroom.getName())
                .number(classroom.getNumber())
                .seats(classroom.getSeats())
                .projector(classroom.getProjector())
                .whiteboard(classroom.getWhiteboard())
                .blackboard(classroom.getBlackboard())
                .speakers(classroom.getSpeakers())
                .available(classroom.isAvailable())
                .reservations_class(
                        classroom
                                .getReservations_class()
                                .stream()
                                .map(Reservation::getId)
                                .collect(
                                        Collectors.toList()
                                )
                )
                .build();



    }
    public Classroom map(ClassroomRequest classroomRequest){
        return Classroom
                .builder()
                .number(classroomRequest.getNumber())
                .name(classroomRequest.getName())
                .build();
    }
}
