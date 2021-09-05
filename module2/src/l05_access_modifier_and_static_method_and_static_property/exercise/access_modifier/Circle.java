package l05_access_modifier_and_static_method_and_static_property.exercise.access_modifier;

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

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
