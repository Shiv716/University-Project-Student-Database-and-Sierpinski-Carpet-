package Pointers;


public class Module  {

    public final String module_id;

    //A class-list for default capacity of 5 students:-
    public static Student [] class_list = new Student[5];


    //In this we stored the current size of class-list:-
    private static int n;
    public static Student class_size = class_list[n];


    @Override
    public String toString() {
        return "Module_id: " + module_id+"class size currently is: "
                + class_size;
    }

    public Module(String module_id) {
        this.module_id = module_id;
    }


    //PASS IN THE STUDENT OBJECT which are needed to be enrolled:-
    public static void enroll_students(Student o ){

        //THIS STORES THE STUDENT NAME:
        Student student_name = new Student(o.student_id);

        int z = 0;
        class_list[z] = student_name;

        //This method stores the student id in corresponding to the module id and returns student id.
    }

    //PASS IN THE Student Id you wish to remove from the total list of students:-
    public static void unenroll_students(Student o) {

        //THIS STORES THE STUDENT NAME:
        Student student_name = new Student(o.student_id);

        int z = 0;
        class_list[z] = null;
        }
    }




