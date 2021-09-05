package l04_class_and_object_in_java.exercise.lop_phuong_trinh_bac_hai;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(0,0,0);
        quadraticEquation.display();
        quadraticEquation.setA(2);
        quadraticEquation.setB(4);
        quadraticEquation.setC(-2);
        quadraticEquation.display();
    }
}
