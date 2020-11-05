package org.example;

import org.example.repository.Classroom.ClassRoomRepository;
import org.example.repository.Classroom.HibernateRepository;
import org.example.repository.Classroom.InMemoryClassRoomRepository;
import org.example.repository.Classroom.JDBCClassroomRepository;
import org.example.service.BookService;

import java.util.HashSet;
import java.util.Scanner;

public class Main {                        // ????
    private BookService bookService;

    public static void main(String[] args) {
        new Main().run();               // nie rozumiem tej konstrukcji nowy obiekt Main?? i na nim metoda run?
    }                                   // - ?utworzono instancje klasy main po to aby metody mogly byc niestatyczne ?

        public void run () {
            HashSet<ClassRoom> classRooms = new HashSet<>();
            final ClassRoomRepository repository = new HibernateRepository();
            bookService = new BookService(repository);

            HashSet<Instructor> instructors = new HashSet<>();

            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    System.out.println("1 - classroom service");
                    System.out.println("2 - instructor service");
                    System.out.println("3 - practical classes service");
                    System.out.println("4 - exit app");
                    final String next = scanner.next();
                    if (next.equals("1")) {
                        while (true) {
                            System.out.println("1 - book classroom");
                            System.out.println("2 - find classroom");
                            System.out.println("3 - add classroom");
                            System.out.println("4 - delete classroom");
                            System.out.println("5 - exit app");
                            final String nextclass = scanner.next();
                            if (nextclass.equals("1")) {
                                bookClassroom(scanner);
                            }
                            if (nextclass.equals("2")) {
                                findClassroom(scanner);
                            }
                            if (nextclass.equals("3")) {
                                addClassroom(scanner);
                            }
                            if (nextclass.equals("4")) {
                                deleteClassroom(scanner);
                            }
                            if (nextclass.equals("5")) {
                                break;
                            }
                           }
                          }
                    if(next.equals("2")) {
                        while (true) {
                            System.out.println("1 - set instructor");
                            System.out.println("2 - find instructor");
                            System.out.println("3 - add instructor");
                            System.out.println("4 - delete instructor");
                            System.out.println("5 - exit app");
                            final String nextclass = scanner.next();
                            if (nextclass.equals("1")) {
                                setInstructor(scanner);
                            }
                            if (nextclass.equals("2")) {
                                findInstructor(scanner);
                            }
                            if (nextclass.equals("3")) {
                                addInstructor(scanner);
                            }
                            if (nextclass.equals("4")) {
                                deleteInstructor(scanner);
                            }
                            if (nextclass.equals("5")) {
                                break;
                            }
                        }
                    }











                    }

                }
            }

    private void setInstructor(Scanner scanner) {
    }
    private void findInstructor(Scanner scanner) {
    }
    private void addInstructor(Scanner scanner) {
    }
    private void deleteInstructor(Scanner scanner) {
    }



    private void addClassroom(Scanner scanner) {
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
            System.out.println("Enter seats: ");
            int seats = scanner.nextInt();
            System.out.println("Enter projector: ");
            int projector = scanner.nextInt();
            System.out.println("Enter whiteboard: ");
            int whiteboard = scanner.nextInt();
            System.out.println("Enter blackboard: ");
            int blackboard = scanner.nextInt();
            System.out.println("Enter speakers: ");
            int speakers = scanner.nextInt();

            bookService.save(new ClassRoom(number, seats, projector, whiteboard, blackboard,
                    speakers, true));
        }

    private void findClassroom(Scanner scanner) {
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(bookService.findByNumber(number));
    }
    private void deleteClassroom(Scanner scanner) {
        System.out.println("Enter number of classroom to delete: ");
        int delnumber = scanner.nextInt();

    }
    private void bookClassroom (Scanner scanner) {
        System.out.println("Enter number of classroom to book: ");
        int booknumber = scanner.nextInt();
    }
}






