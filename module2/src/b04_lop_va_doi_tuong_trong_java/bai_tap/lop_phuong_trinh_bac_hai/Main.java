package b04_lop_va_doi_tuong_trong_java.bai_tap.lop_phuong_trinh_bac_hai;

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
