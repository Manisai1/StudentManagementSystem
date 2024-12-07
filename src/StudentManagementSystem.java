import java.util.Scanner;
import java.util.List;

class StudentManagementSystem {
    public static void displayMenu(Student[] students, Course[] courses) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enroll Students for the Course");
            System.out.println("2. View Enrollment Details of Students");
            System.out.println("3. Explore Course Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enrollStudentInCourse(scanner, students, courses);
                    break;
                case 2:
                    viewStudentEnrollmentDetails(scanner, students);
                    break;
                case 3:
                    viewEnrolledStudentsInCourse(scanner, courses);
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void enrollStudentInCourse(Scanner scanner, Student[] students, Course[] courses) {
        System.out.println("Available Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + ". " + students[i].getName());
        }

        System.out.print("Enter student number: ");
        int studentIndex = scanner.nextInt();

        if (studentIndex < 0 || studentIndex >= students.length) {
            System.out.println("Invalid student number.");
            return;
        }

        Student selectedStudent = students[studentIndex];

        System.out.println("Available Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(i + ". " + courses[i].getName());
        }

        System.out.print("Enter course number: ");
        int courseIndex = scanner.nextInt();

        if (courseIndex < 0 || courseIndex >= courses.length) {
            System.out.println("Invalid course number.");
            return;
        }

        Course selectedCourse = courses[courseIndex];

        selectedStudent.enrollInCourse(selectedCourse.getName());
        selectedCourse.addStudent(selectedStudent);
    }

    private static void viewStudentEnrollmentDetails(Scanner scanner, Student[] students) {
        System.out.println("Available Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + ". " + students[i].getName());
        }

        System.out.print("Enter student number: ");
        int studentIndex = scanner.nextInt();

        if (studentIndex < 0 || studentIndex >= students.length) {
            System.out.println("Invalid student number.");
            return;
        }

        Student selectedStudent = students[studentIndex];
        List<String> enrolledCourses = selectedStudent.getEnrolledCourses();

        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Enrolled Courses:");
            for (String course : enrolledCourses) {
                System.out.println(course);
            }
        }
    }

    private static void viewEnrolledStudentsInCourse(Scanner scanner, Course[] courses) {
        System.out.println("Available Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(i + ". " + courses[i].getName());
        }

        System.out.print("Enter course number: ");
        int courseIndex = scanner.nextInt();

        if (courseIndex < 0 || courseIndex >= courses.length) {
            System.out.println("Invalid course number.");
            return;
        }

        Course selectedCourse = courses[courseIndex];
        selectedCourse.viewEnrolledStudents();
    }
}