public class Courses {
    String course_name;
    String course_code;
    Instructor instructor;

    public Courses(String course_name, String course_code, Instructor instructor) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.instructor = instructor;
    }

    public void edit(String newCourseName, String newCourseCode, Instructor newInstructor) {
        this.course_name = newCourseName;
        this.course_code = newCourseCode;
        this.instructor = newInstructor;
        System.out.println("Course edited: " + course_name);
    }

    public void delete() {
        System.out.println("Course deleted: " + course_name);
    }
}
