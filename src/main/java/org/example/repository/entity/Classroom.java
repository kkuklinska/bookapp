package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classroomtab")
public class Classroom {
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

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "INSTRUCTORS_CLASSROOMS",
//            joinColumns = {@JoinColumn(name = "CLASSROOM_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "INSTRUCTOR_ID")}
//    )
}
//    private List<Instructor> instructors;
//
//    }





