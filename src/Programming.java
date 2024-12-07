class ProgrammingCourse extends Course {
    private String programmingLanguage;

    public ProgrammingCourse(int courseID, String name, int maxStudents, String programmingLanguage) {
        super(courseID, name, maxStudents);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void getCourseDetails() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getName());
        System.out.println("Programming Language: " + programmingLanguage);
    }
}