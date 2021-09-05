package l05_access_modifier_and_static_method_and_static_property.practice.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String name){
        this.rollno = rollno;
        this.name = name;
    }

    //static method to change the value of static variable
    static void change(){
        college = "CODEGYM";
    }

    //method to display values
    void display(){
        System.out.println(this.rollno + " " + this.name + " " + college);
    }
}
