package Lists;

import java.util.ArrayList;
import java.util.Arrays;


public class StudentSupportOffice {

    public static ArrayList<Grade> g_list = new ArrayList<>();
    public static ArrayList<Student> s_list = new ArrayList<>();
    public static ArrayList<Module> m_list = new ArrayList<>();


    //Making it impactful on avg_grades:-
    public static void grade_check(Student s , Module m , Grade g){
        int student_grade = s.avg_grade_student;
        int module_grade = m.avg_grade_module;
        int grade = g.score;

        // Averaging scores:-

        grade = student_grade + module_grade / 2 ;
        System.out.println(grade);
    }


    public static void main(String[] args) {
        Module m1 = new Module("CIS2344",60);
        Module m2 = new Module("CIS2360",60);
        Student s1 = new Student( "U0000001",55);
        Student s2 = new Student( "U0000002",75);
        Grade g1 = new Grade(100,s1,m1);
        Grade g2 = new Grade(55,s1,m2);

        System.out.print(g1 + "\n");
        System.out.print(g2+"\n");

        //Listing here:-

        g_list.add(g1);
        g_list.add(g2);
        System.out.println("Grade list : "+"\n" +Arrays.toString(g_list.toArray()));

        m_list.add(m1);
        m_list.add(m2);

        s_list.add(s1);
        s_list.add(s2);

        //Average printing:-
        System.out.println("For module m1 average score is: "+m1.avg_grade_module+"\n"+"And for average, student s1 grade is: "+s1.avg_grade_student);
        System.out.println("For module m2 average score is: "+m2.avg_grade_module+"\n"+"And for average, student s2 grade is: "+s2.avg_grade_student);

        //Reflecting scores on avg_grades:-

        grade_check(s1 , m1 , g1);
        grade_check(s2 , m2 , g2);

    }
}
