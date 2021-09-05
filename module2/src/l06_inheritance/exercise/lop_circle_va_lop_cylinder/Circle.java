package l06_inheritance.exercise.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(){

    }

    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString(){
        return "This is a circle with radius"
                + this.radius +"," + this.color
                + "color and area" + this.getArea();
    }
}
