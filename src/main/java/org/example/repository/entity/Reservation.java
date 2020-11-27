package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private long id;

    @Temporal(TemporalType.TIME)
    private Date utildate;
    @Temporal(TemporalType.DATE)
    private Calendar calender;
    @ManyToOne
    @JoinColumn(name = "reservations_class")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "reservations_instr")
    private Instructor instructor;


}
