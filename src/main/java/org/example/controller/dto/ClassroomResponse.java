package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.repository.entity.Reservation;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // wzorzec projektowy
// to jest warstwa prezentacji juz nie bazy danych

public class ClassroomResponse {
    private Long id;
    private String name;
    private int number;
    private int seats;
    private int projector;
    private int whiteboard;
    private int blackboard;
    private int speakers;
    private boolean available;
    private List<Long> reservations_class;




}
