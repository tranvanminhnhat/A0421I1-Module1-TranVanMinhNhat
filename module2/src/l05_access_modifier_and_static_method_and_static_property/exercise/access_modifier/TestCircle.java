package l05_access_modifier_and_static_method_and_static_property.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(45);
        System.out.println(circle.getArea());
    }
}
