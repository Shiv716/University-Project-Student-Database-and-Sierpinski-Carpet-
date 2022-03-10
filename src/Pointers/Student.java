package Pointers;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    public final String student_id;

    @Override
    public String toString() {
        return "Student_id: " + student_id ;
    }

    public Student(String student_id) {
        this.student_id = student_id;
    }

    //CHECK WHAT TO DO WITH THIS?
    @Override
    public int compareTo(Student o) {
        if (student_id.equals(student_id)){
            return 1;
        }
        else if (!student_id.equals(student_id)){
            return 0;
        }
        return -1;
    }

}
