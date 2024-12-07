class MathCourse extends Course {
    private boolean calculusRequired;

    public MathCourse(int courseID, String name, int maxStudents, boolean calculusRequired) {
        super(courseID, name, maxStudents);
        this.calculusRequired = calculusRequired;
    }

    public boolean isCalculusRequired() {
        return calculusRequired;
    }

    public void setCalculusRequired(boolean calculusRequired) {
        this.calculusRequired = calculusRequired;
    }

    @Override
    public void getCourseDetails() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getName());
        System.out.println("Calculus Required: " + (calculusRequired ? "Yes" : "No"));
    }
}