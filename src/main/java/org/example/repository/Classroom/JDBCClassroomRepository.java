package org.example.repository.Classroom;

import org.example.ClassRoom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCClassroomRepository implements ClassRoomRepository {

        public static final String USER = "postgres";
        public static final String PASSWORD = "qwerty";
        public static final String JDBC_URL = "jdbc:postgresql://127.0.0.1:5432/test";


    @Override
    public void save(ClassRoom classroom) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            final int number = classroom.getNumber();
            final PreparedStatement statement = connection.prepareStatement("INSERT INTO USERS(NUMBER) VALUES (?,?)");
            statement.setInt(1, number);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
}






