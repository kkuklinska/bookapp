package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class Main //implements CommandLineRunner
{
//    private BookService bookService;      rest api
//    private final ClassroomSpringJpaRepository repository;
//
//    @Autowired
//    public Main(
//            BookService bookService,
//            ClassroomSpringJpaRepository repository) {    // tworzymy konstruktor maina i tu wstrzykniecie
//
//        this.bookService = bookService;
//        this.repository = repository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}
//
//    @Override
//    public void run(String... args) {
//
//        final List<ClassRoom> list = repository.findByName("Sala Lustrzana");
//        list.forEach(System.out::println);
//
//        System.out.println("hello world");

//        Page<ClassRoom> sala = repository.findByName("Sala Złota", PageRequest.of(0, 1));
//        System.out.println(sala);  // tu bedzie tylko 1 z 4 stron i typ jaki jest na stronie
//        sala.getContent().forEach(System.out::println); // zeby sie dobrac do tego co jest na stronie
//        page.gettotalpages() i zey wyswietlyic wszytsko to
//        for(int i =1; i<totalPages; i++){
//        final Page<ClassRoom> page = repository.findByName( "Sala Zlota", PageRequest.of(i, 1, Sort.by("email").descending)
//        sout(page)
//        page.getContent().forEach(System.out::println);

//   final List<Client> allByName = repository.findAll(Sort.by("name"))
//        allByName.forEach(System.out::println);

//        HashSet<ClassRoom> classRooms = new HashSet<>();
//            List<Instructor> instructors = new LinkedList<>();

//   rest api     try (Scanner scanner = new Scanner(System.in)) {
//                while (true) {
//                    System.out.println("1 - classroom service");
//                    System.out.println("2 - instructor service");
//                    System.out.println("3 - practical classes service");
//                    System.out.println("4 - exit app");
//                    final String next = scanner.next();
//                    if (next.equals("1")) {
//                        while (true) {
//                            System.out.println("1 - book classroom");
//                            System.out.println("2 - find classroom");
//                            System.out.println("3 - add classroom");
//                            System.out.println("4 - update classroom");
//                            System.out.println("5 - delete classroom");
//                            System.out.println("6 - back to main menu");
//                            final String nextclass = scanner.next();
//                            if (nextclass.equals("1")) {
//                                bookClassroom(scanner);
//                            }
//                            if (nextclass.equals("2")) {
//                                findClassroom(scanner);
//                            }
//                            if (nextclass.equals("3")) {
//                                addClassroom(scanner);
//                            }
//                            if (nextclass.equals("4")) {
//                                updateClassroom(scanner);
//                            }
////                            if (nextclass.equals("5")) {
////                                deleteClassroom(scanner);
////                            }
//                            if (nextclass.equals("6")) {
//                                break;
//                            }
//                           }
//                          }
//                    if(next.equals("2")) {
//                        while (true) {
//                            System.out.println("1 - set instructor");
//                            System.out.println("2 - find instructor");
//                            System.out.println("3 - add instructor");
//                            System.out.println("4 - delete instructor");
//                            System.out.println("5 - back to main menu");
//                            final String nextclass = scanner.next();
//                            if (nextclass.equals("1")) {
//                                setInstructor(scanner);
//                            }
//                            if (nextclass.equals("2")) {
//                                findInstructor(scanner);
//                            }
//                            if (nextclass.equals("3")) {
//                                addInstructor(scanner);
//                            }
//                            if (nextclass.equals("4")) {
//                                deleteInstructor(scanner);
//                            }
//                            if (nextclass.equals("5")) {
//                                break;
//                            }
//                        }
//                    }
//                    if (next.equals("3")) {
//                        while (true) {
//                            System.out.println("1 - book practical classes");
//                            System.out.println("2 - find practical classes");
//                            System.out.println("3 - add new practical classes");
//                            System.out.println("4 - delete practical classes");
//                            System.out.println("5 - back to main menu ");
//                            final String nextclass = scanner.next();
//                            if (nextclass.equals("1")) {
//                                bookPracticalClasses(scanner);
//                            }
//                            if (nextclass.equals("2")) {
//                                findPracticalClasses(scanner);
//                            }
//                            if (nextclass.equals("3")) {
//                                addPracticalClasses(scanner);
//                            }
//                            if (nextclass.equals("4")) {
//                                deletePracticalClasses(scanner);
//                            }
//                            if (nextclass.equals("5")) {
//                                break;
//                            }
//                        }
//                    }
//                    if (next.equals("4")) {
//                        break;
//                    }
//                  }
//                }
//            }
//
//
//    private void bookPracticalClasses(Scanner scanner) {
//    }
//
//    private void findPracticalClasses(Scanner scanner) {
//    }
//
//    private void addPracticalClasses(Scanner scanner) {
//    }
//
//    private void deletePracticalClasses(Scanner scanner) {
//    }
//
//
//
//    private void setInstructor(Scanner scanner) {
//    }
//    private void findInstructor(Scanner scanner) {
//    }
//    private void addInstructor(Scanner scanner) {
//    }
//    private void deleteInstructor(Scanner scanner) {
//    }
//
//
//
//    private void addClassroom(Scanner scanner) {
//            scanner.nextLine();
//            System.out.println("Enter name: ");
//            String name = scanner.nextLine();
//            System.out.println("Enter number: ");
//            int number = scanner.nextInt();
//            System.out.println("Enter seats: ");
//            int seats = scanner.nextInt();
//            System.out.println("Enter projector: ");
//            int projector = scanner.nextInt();
//            System.out.println("Enter whiteboard: ");
//            int whiteboard = scanner.nextInt();
//            System.out.println("Enter blackboard: ");
//            int blackboard = scanner.nextInt();
//            System.out.println("Enter speakers: ");
//            int speakers = scanner.nextInt();
//
//
//        bookService.save(new ClassRoom(null,name,number,seats,projector,whiteboard,blackboard,speakers,true, null));
//        }
//
//    private void findClassroom(Scanner scanner) {
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
//        System.out.println(bookService.findByNumber(number));
//    }
//    private void updateClassroom(Scanner scanner) {
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter seats: ");
//        int seats = scanner.nextInt();
//        System.out.println("Enter projector: ");
//        int projector = scanner.nextInt();
//        System.out.println("Enter whiteboard: ");
//        int whiteboard = scanner.nextInt();
//        System.out.println("Enter blackboard: ");
//        int blackboard = scanner.nextInt();
//        System.out.println("Enter speakers: ");
//        int speakers = scanner.nextInt();
//
//
//        bookService.findByNumber(number).setName(name);
//        bookService.findByNumber(number).setSeats(seats);
//        bookService.findByNumber(number).setSeats(projector);
//        bookService.findByNumber(number).setWhiteboard(whiteboard);
//        bookService.findByNumber(number).setBlackboard(blackboard);
//        bookService.findByNumber(number).setSpeakers(speakers);
//
//    }
////    private void deleteClassroom(Scanner scanner) {
////        System.out.println("Enter number of classroom to delete: ");
////        int delnumber = scanner.nextInt();
////        bookService.delete(delnumber);
////
////    }
//    private void bookClassroom (Scanner scanner) {
//        System.out.println("Enter number of classroom to book: ");
//        int booknumber = scanner.nextInt();







