public class Grade {
    private Student student;
    private Courses course;
    private double grade;

    public Grade(Student student, Courses course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }
    public Student getStudent() {
        return student;
    }
    public Courses getCourse() {
        return course;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public static void recordGrade(Student student, Courses course, double grade) {
        Grade newGrade = new Grade(student, course, grade);
        student.addGrade(course.getCourse_name(), newGrade);
    }
    public String toString() {
        return "Grade for " + student.getName() + " in " + course.getCourse_name() + ": " + grade;
    }
}
