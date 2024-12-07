import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice"),
                new Student(2, "Bob"),
                new Student(3, "Charlie")
        };

        Course[] courses = {
                new MathCourse(201, "Calculus 101", 30, true),
                new ProgrammingCourse(301, "Java Programming", 25, "Java")
        };

        StudentManagementSystem.displayMenu(students, courses);
    }
}