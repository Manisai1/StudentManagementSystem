import java.util.ArrayList;
import java.util.List;

abstract class Course {
    private int courseID;
    private String name;
    private List<Student> enrolledStudents;
    private int maxStudents;

    public Course(int courseID, String name, int maxStudents) {
        this.courseID = courseID;
        this.name = name;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (enrolledStudents.size() >= maxStudents) {
            System.out.println("Cannot add student. Course is full.");
        } else if (enrolledStudents.contains(student)) {
            System.out.println("Student is already enrolled in this course.");
        } else {
            enrolledStudents.add(student);
            System.out.println("Student added successfully to the course: " + name);
        }
    }

    public void viewEnrolledStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled in this course.");
        } else {
            System.out.println("Enrolled Students:");
            for (Student student : enrolledStudents) {
                System.out.println(student.getName());
            }
        }
    }

    public abstract void getCourseDetails();
}