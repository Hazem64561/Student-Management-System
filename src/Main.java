public class Main {
    public static void main(String[] args) {
        //create students
        Student moemn = new Student("moemn", 1, "moemn@example.com");
        Student hazem = new Student("hazem", 2, "hazem@example.com");
        Student mohammad = new Student("mohammad", 3, "hazem@example.com");

        //create instructors
        Instructor basil = new Instructor("basil", 22, "basil@example.com");
        Instructor basil2 = new Instructor("basil2", 23, "basil2@example.com");

        // create courses
        Courses software_testing = new Courses("software_testing", "A101", basil);
        Courses mobile_dev = new Courses("mobile_dev", "A102", basil);

        // student display, edit and delete
        hazem.display();
        hazem.edit("hazem_hamed", 2, "hazem_hamed@example.com");
        hazem.display();
        moemn.display();
        moemn.delete();
        moemn.display();

        // instructor display, edit and delete
        basil.display();
        basil.edit("basil", 22, "engBasil@example.com");
        basil.display();
        basil2.display();
        basil2.delete();
        basil2.display();

        // course edit and delete
        software_testing.edit("QA/QC", "A101", basil);
        mobile_dev.delete();

        // record a course grades for a student
        Grade grade1 = new Grade(mohammad, software_testing, 90);
        Grade grade2 = new Grade(mohammad, software_testing, 85);
        Grade grade3 = new Grade(mohammad, software_testing, 95);
        
        Grade[] grades = {grade1, grade2, grade3};
        grade1.recordGrade();
        grade2.recordGrade();
        grade3.recordGrade();

        // total grades
        int total = Grade.totalGrade(grades);
        System.out.println("Total Grade: " + total);


 

    }
    }
