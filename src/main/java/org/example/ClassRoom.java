package org.example;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.Objects;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        ClassRoom.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }

    public int getWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(int whiteboard) {
        this.whiteboard = whiteboard;
    }

    public int getBlackboard() {
        return blackboard;
    }

    public void setBlackboard(int blackboard) {
        this.blackboard = blackboard;
    }

    public int getSpeakers() {
        return speakers;
    }

    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }

    public static boolean isAvailable() {
        return available;
    }

    public static void setAvailable(boolean available) {
        ClassRoom.available = available;
    }

    //    public static int getNumber() {            //zeby miec dostep do gettera musialam dodac static czemu?
//        return number;
//    }

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





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return number == classRoom.number &&
                seats == classRoom.seats &&
                projector == classRoom.projector &&
                whiteboard == classRoom.whiteboard &&
                blackboard == classRoom.blackboard &&
                speakers == classRoom.speakers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, seats, projector, whiteboard, blackboard, speakers);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "number=" + number +
                ", seats=" + seats +
                ", projector=" + projector +
                ", whiteboard=" + whiteboard +
                ", blackboard=" + blackboard +
                ", speakers=" + speakers +
                ", available=" + available +
                '}';

    }
}

