package org.example;

import org.example.repository.InMemoryClassRoomRepository;
import org.example.service.BookService;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {                        // ????
    private BookService bookService;

    public static void main(String[] args) {
        new Main().run();               // nie rozumiem tej konstrukcji nowy obiekt Main?? i na nim metoda run?
    }                                   // - ?utworzono instancje klasy main po to aby metody mogly byc niestatyczne ?

        public void run () {


            try (Scanner scanner = new Scanner(System.in)) {
                HashSet<ClassRoom> classRooms = new HashSet<>();
                final InMemoryClassRoomRepository repository = new InMemoryClassRoomRepository(classRooms);
                bookService = new BookService(repository);

                while (true) {
                    System.out.println("1 - book classroom");
                    System.out.println("2 - find classroom");
                    System.out.println("3 - add classroom");
                    System.out.println("4 - delete classroom");
                    System.out.println("5 - exit app");
                  final String next = scanner.next();
                    if(next.equals("1")) {
                        bookClassroom(scanner);
                    }
                  if(next.equals("2")) {
                      findClassroom(scanner);
                  }
                    if(next.equals("3")) {
                        addClassroom(scanner);
                    }
                    if(next.equals("4")) {
                        deleteClassroom(scanner);
                    }
                    if(next.equals("4")) {
                        break;
                    }
                }
            }
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
        System.out.println();
        try {
            bookService.delete(delnumber);
            System.out.println("Classroom deleted successfully.");
        }
        catch(NoSuchElementException exception){
            System.out.println("This classroom is not exist");
        }
    }
    private void bookClassroom (Scanner scanner) {
        System.out.println("Enter number of classroom to book: ");
        int booknumber = scanner.nextInt();
            try {
                if(ClassRoom.getAvailable()== false) {
                    System.out.println("This classroom is not available");
                }
                if (ClassRoom.getAvailable() == true) {
                    bookService.findByNumber((booknumber)).setAvailable(false);
                    System.out.println("Classroom booked successfully.");
                }
            }
         catch(NoSuchElementException exception){
            System.out.println("This classroom is not exist");
        }
      }
   }






