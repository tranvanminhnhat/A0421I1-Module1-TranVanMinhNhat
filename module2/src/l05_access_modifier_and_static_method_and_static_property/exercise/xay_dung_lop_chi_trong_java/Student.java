package l05_access_modifier_and_static_method_and_static_property.exercise.xay_dung_lop_chi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    Student(){

    }

    public String toString(){
        return "name: " + this.name + "\n" + "class: " + this.classes;
    }
}
