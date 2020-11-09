package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classroombase")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLASSROOM_ID")
    private Long id;
    @Column(name = "CLASSROOM_NAME")
    private String name;
    @Column(name = "NUMBER")
    private int number;
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
    private boolean available;



//    @ManyToMany(mappedBy = "classrooms")
//    private List<Instructor> instructors;

    }





