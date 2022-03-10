package Pointers;

import java.util.Arrays;

public class StudentsupportOffice {

    public static void main(String[] args) {

        //THESE ARE THE LIST OF AVAILABLE MODULE-ID'S AND STUDENT ID'S .
        String[] array_students = {"U0000001", "U0000002", "U0000003", "U0000004", "U0000005"};
        String[] array_modules = {"CIS2344", "CIS2360", "CIM2130"};


        // Following are the module id's present.
        //SPECIFYING THE MODULE ID :-
        Module m1 = new Module("CIS2344");
        Module m2 = new Module("CIS2360");
        Module m3 = new Module("CIM2130");


        //Specifying student id's:-
        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");


        //Implementing enroll method :-

        /*
        Here , we are creating objects that store the enroll_students objects
        from Module class.
         */

        //CREATING OBJECTS FOR REQUIRED STUDENT ID'S TO ENROLL THEM:-

        //FOR MODULE CIS2344 :
        System.out.println("List of enrolled students are for the module: "+m1.module_id);
        Module.enroll_students(s1);
        Module.enroll_students(s4);


        //FOR MODULE CIS2360 :
        System.out.println("List of enrolled students are for the module: "+m2.module_id);
        Module.enroll_students(s1);
        Module.enroll_students(s3);
        Module.enroll_students(s5);


        //FOR MODULE CIM2130 :
        System.out.println("List of enrolled students are for the module: "+m3.module_id);
        Module.enroll_students(s3);
        Module.enroll_students(s4);
        Module.enroll_students(s5);


        //Implementing un-enroll method wherever necessary :-

        // Subsequently changing as said :-

        //FOR MODULE CIS2344 :
        System.out.println("List of enrolled students are for the module: "+m1.module_id);
        Module.enroll_students(s2);
        Module.enroll_students(s3);
        Module.enroll_students(s5);

        //FOR MODULE CIS2360 :
        System.out.println("List of enrolled students are for the module: "+m2.module_id);
        Module.unenroll_students(s3);
        Module.enroll_students(s2);

        //FOR MODULE CIM2130 :
        System.out.println("List of enrolled students are for the module: "+m3.module_id);
        Module.unenroll_students(s5);
        Module.enroll_students(s1);

        }

    }

