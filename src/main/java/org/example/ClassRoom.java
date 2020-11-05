package org.example;

import java.util.Objects;

public class ClassRoom {
    private static int number;
    private int seats;
    private int projector;
    private int whiteboard;
    private int blackboard;
    private int speakers;
    private static boolean available = true;

    public static boolean isAvailable() {
        return available;
    }

    public static void setAvailable(boolean isAva) {
        available= isAva;
    }

    public static int getNumber() {            //zeby miec dostep do gettera musialam dodac static czemu?
        return number;
    }

    public ClassRoom(int number, int seats, int projector, int whiteboard, int blackboard, int speakers, boolean available) {
        this.number = number;
        this.seats = seats;
        this.projector = projector;
        this.whiteboard = whiteboard;
        this.blackboard = blackboard;
        this.speakers = speakers;
        this.available = available;
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

