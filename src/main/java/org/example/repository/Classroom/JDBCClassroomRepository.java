package org.example.repository.Classroom;

import org.example.ClassRoom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCClassroomRepository implements ClassRoomRepository {

        public static final String USER = "postgres";
        public static final String PASSWORD = "qwerty";
        public static final String JDBC_URL = "jdbc:postgresql://127.0.0.1:5432/test";   // ://127.0.0.1:49311/browser/


    @Override
    public void save(ClassRoom classroom) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            final int number = classroom.getNumber();
            long id = classroom.getId();
            String name = classroom.getName();
            int seats = classroom.getSeats();
            int projector= classroom.getProjector();
            int whiteboard= classroom.getWhiteboard();
            int blackboard= classroom.getBlackboard();
            int speakers = classroom.getSpeakers();
            boolean available= classroom.isAvailable();
            final PreparedStatement statement = connection.prepareStatement(              //zmieniona nazwa tabeli na male litery
                    "INSERT INTO classroombase (CLASSROOM_ID, CLASSROOM_NAME, NUMBER, SEATS, PROJECTOR, WHITEBOARD, BLACKBOARD, SPEAKERS,AVAILABLE) VALUES (?,?,?,?,?,?,?,?,?)");
            statement.setLong(1, id);
            statement.setString(2, name);
            statement.setInt(3, number);
            statement.setInt(4, seats);
            statement.setInt(5, projector);
            statement.setInt(6, whiteboard);
            statement.setInt(7, blackboard);
            statement.setInt(8, speakers);
            statement.setBoolean(9, available);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//            final PreparedStatement statement = connection.prepareStatement("INSERT INTO CLASSROOMBASE(NUMBER) VALUES (?)");
//            statement.setInt(1, number);
//            statement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

    @Override
    public ClassRoom findByNumber(int number) {
        return null;
    }

    @Override
    public void delete(int classroom) {

    }

    @Override
    public void book(int number) {

    }

    @Override
    public ClassRoom update(Long id, String name, int number, int seats, int projector, int whiteboard, int blackboard, int speakers, boolean available) {
        return null;
    }

}






