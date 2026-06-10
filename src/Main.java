import java.util.ArrayList;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        // sample students
        students.add(new Student("S01", "John", 75));
        students.add(new Student("S02", "Ann", 85));

        // operations
        displayStudents();
        searchStudent("S01");
        calculateAverage();
    }

    // display all students
    static void displayStudents() {
        System.out.println("\n--- Student List ---");

        for (Student s : students) {
            s.displayStudent();
        }
    }

    // search student by ID
    static void searchStudent(String id) {
        System.out.println("\n--- Search Result ---");

        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("Found:");
                s.displayStudent();
                return;
            }
        }

        System.out.println("Student not found");
    }

    // calculate average marks
    static void calculateAverage() {
        System.out.println("\n--- Average Marks ---");

        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        System.out.println("Average: " + (total / students.size()));
    }
}