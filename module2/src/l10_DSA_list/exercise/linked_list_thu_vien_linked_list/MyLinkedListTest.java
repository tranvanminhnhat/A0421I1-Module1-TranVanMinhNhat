package l10_DSA_list.exercise.linked_list_thu_vien_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student_1 = new Student(1,"Nhat");
        Student student_2 = new Student(2,"Hung");
        Student student_3 = new Student(3,"Quang");
        Student student_4 = new Student(4,"Phuc");
        Student student_5 = new Student(5,"Anh");

        myLinkedList.addFirst(student_1);
        myLinkedList.addLast(student_2);
        myLinkedList.addLast(student_3);
        myLinkedList.addLast(student_4);
        myLinkedList.addLast(student_5);

    }
}
