package l12_java_collection_framework.practice.phan_biet_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student("Nam", 20, "HN");
        Student student_2 = new Student("Nha", 21, "DN");
        Student student_3 = new Student("Tuan", 22, "QN");

        Map<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(1,student_1);
        studentHashMap.put(2,student_2);
        studentHashMap.put(3,student_3);
        studentHashMap.put(4,student_1);

        for (Map.Entry<Integer, Student> student : studentHashMap.entrySet()){
            System.out.println(student.toString());
        }

        Set<Integer> keys = studentHashMap.keySet();
        for (Integer key : keys){
            System.out.printf("key: %s| Data: %s\n", key, studentHashMap.get(key));
        }


        System.out.println("-----------Set------------");
        Set<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(student_1);
        studentHashSet.add(student_2);
        studentHashSet.add(student_3);
        studentHashSet.add(student_1);

        for (Student student: studentHashSet){
            System.out.println(student.toString());
        }
    }
}
