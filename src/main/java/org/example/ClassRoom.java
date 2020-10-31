package org.example;

public class ClassRoom {
    private int number;
    private int seats;
    private int projector;
    private int whiteboard;
    private int blackboard;
    private int speakers;
    private boolean available ;

    public static void isAvailable(boolean b) {
    }

    public int getNumber() {
        return number;
    }
    

    public boolean isAvailable() {
        return available == true;
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

