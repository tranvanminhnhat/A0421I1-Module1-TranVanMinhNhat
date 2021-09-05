package l05_access_modifier_and_static_method_and_static_property.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(111, "Khanh");
        Student s3 = new Student(111, "Nam");

        s1.display();
        s2.change();
        s2.display();
        s3.display();
    }
}
