package l07_abstract_class_and_interface.exercise.trien_khai_interface_colorable_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();

        System.out.println("The way to fill");
        for (Shape shape:shapes){
            shape.howToColor();
        }
    }
}
