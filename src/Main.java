import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add 2.Display 3.Search 4.Average 5.Exit");
            int choice = sc.nextInt();

            if (choice == 1) addStudent();
            else if (choice == 2) displayStudents();
            else if (choice == 3) searchStudent();
            else if (choice == 4) calculateAverage();
            else break;
        }
    }

    static void addStudent() {
        System.out.print("ID: ");
        String id = sc.next();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));
    }

    static void displayStudents() {
        for (Student s : students) {
            s.displayStudent();
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID: ");
        String id = sc.next();

        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Not found");
    }

    static void calculateAverage() {
        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        System.out.println("Average Marks: " + (total / students.size()));
    }
}