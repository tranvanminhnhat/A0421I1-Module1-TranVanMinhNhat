package l10_DSA_list.exercise.linked_list_thu_vien_doubly_linked_list;

public class DoublyLinkedListTest {
    static class Student{
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

    public static void main(String[] args) {
        Student student1 = new Student(1,"Nhat");
        Student student2 = new Student(2,"Hung");
        Student student3 = new Student(3,"Quang");
        Student student4 = new Student(4,"Nam");
        Student student5 = new Student(5,"Trinh");

        MyDoublyLinkedList<Student> myDoublyLinkedList = new MyDoublyLinkedList();
        myDoublyLinkedList.addFirst(student1);
        myDoublyLinkedList.addFirst(student2);
        myDoublyLinkedList.addFirst(student3);
        myDoublyLinkedList.addFirst(student4);
        myDoublyLinkedList.addLast(student5);

        myDoublyLinkedList.remove(student1);

        for (int i = 0; i < myDoublyLinkedList.size(); i++){
            Student student = (Student) myDoublyLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
