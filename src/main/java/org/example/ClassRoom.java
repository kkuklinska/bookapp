package org.example;

import lombok.Data;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.Objects;


@Data
@Entity
@Table(name = "CLASSROOMBASE")
public class ClassRoom {
    @Id
    @GeneratedValue
    @Column(name = "CLASSROOM_ID")
    private Long id;
    @Column(name = "CLASSROOM_NAME")
    private String name;
    @Column(name = "NUMBER")
    private static int number;
    @Column(name = "SEATS")
    private int seats;
    @Column(name = "PROJECTOR")
    private int projector;
    @Column(name = "WHITEBOARD")
    private int whiteboard;
    @Column(name = "BLACKBOARD")
    private int blackboard;
    @Column(name = "SPEAKERS")
    private int speakers;
    @Column(name = "AVAILABLE")
    private static boolean available = true;

    //zeby miec dostep do gettera musialam dodac static czemu?

    public ClassRoom() {
    }

    public ClassRoom(Long id, String name, int seats, int projector, int whiteboard, int blackboard, int speakers) {
        this.id = id;
        this.name = name;
        this.seats = seats;
        this.projector = projector;
        this.whiteboard = whiteboard;
        this.blackboard = blackboard;
        this.speakers = speakers;
    }


    }


