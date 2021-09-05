package l10_DSA_list.exercise.array_list_thu_vien_array_list;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student(){
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
        Student a = new Student(1, "Nhat");
        Student b = new Student(2, "Trinh");
        Student c = new Student(3, "Hung");
        Student d = new Student(4, "Cuong");
        Student e = new Student(5, "Anh");

        MyList<Student> myList = new MyList<>();
        myList.add(a);
        myList.add(b,1);
        myList.add(c);
        myList.add(d);
        myList.add(e);

        for (int i = 0; i < myList.size(); i++){
            Student student = (Student) myList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

        System.out.println(myList.get(2).getName());

        System.out.println(myList.indexOf(b));

        MyList<Student> newMyList = new MyList<>();
        newMyList = myList.clone();
        newMyList.remove(0);
        for (int i = 0; i < newMyList.size(); i++){
            System.out.println(newMyList.get(i).getName());
        }
    }
}
