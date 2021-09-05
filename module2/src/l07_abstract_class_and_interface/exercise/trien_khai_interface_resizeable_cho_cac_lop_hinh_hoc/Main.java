package l07_abstract_class_and_interface.exercise.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        System.out.println("Pre:");
        for (Shape shape:shapes){
            System.out.println(shape);
        }

        double randomDouble = Math.random();
        randomDouble = randomDouble * 100 + 1;
        int randomInt = (int) randomDouble;

        System.out.println("After:");
        for (Shape shape:shapes){
            shape.resize(randomInt);
            System.out.println(shape);
        }
    }
}
