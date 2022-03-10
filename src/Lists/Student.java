package Lists;

public class Student {


    public final String student_id;
    public final int avg_grade_student;

    @Override
    public String toString() {
        return "Student_id='" + student_id + '\'' +
                ", avg_grade='" + avg_grade_student + '\'' ;
    }

    public Student(String student_id , int avg_grade_student) {
        this.student_id = student_id;
        this.avg_grade_student = avg_grade_student;
    }
}
