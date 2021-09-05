package l07_abstract_class_and_interface.exercise.trien_khai_interface_colorable_lop_hinh_hoc;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public double getArea(){
        return this.radius*this.radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + this.getColor() +
                ", filled=" + this.isFilled() +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                '}';
    }
    @Override
    public void howToColor() {
        System.out.println("Fill in the border of the circle");
    }
}
