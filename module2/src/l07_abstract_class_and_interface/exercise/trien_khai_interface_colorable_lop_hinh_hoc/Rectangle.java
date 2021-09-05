package l07_abstract_class_and_interface.exercise.trien_khai_interface_colorable_lop_hinh_hoc;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color=" + this.getColor() +
                ", filled=" + this.isFilled() +
                ", area=" + this.getArea() +
                ", perimeter="+ this.getPerimeter() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Fill in the edge of the rectangle");
    }
}
