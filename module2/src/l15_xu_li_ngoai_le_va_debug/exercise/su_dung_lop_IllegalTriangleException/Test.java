package l15_xu_li_ngoai_le_va_debug.exercise.su_dung_lop_IllegalTriangleException;

public class Test {
    public static void main(String[] args) {
       Triangle triangle;
       try {
           triangle = new Triangle(1,4,7);
       }catch (IllegalTriangleException e){
           System.out.println(e.getMessage());
       }
    }
}
