public class Grade {
    private Student student;
    private Courses course;
    private int grade;

    public Grade(Student student, Courses course, int grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public void recordGrade() {
        System.out.println("Recorded Grade: " + grade + " for Student: " + student.getName() + " in Course: " + course.course_name);
    }

    public static int totalGrade(Grade[] grades) {
        int total = 0;
        for (Grade g : grades) {
            total += g.grade;
        }
        return total;
    }
}
