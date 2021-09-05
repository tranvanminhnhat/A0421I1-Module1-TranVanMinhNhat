package l06_inheritance.exercise.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getArea(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "This is a cylinder with a radius of "
                + this.getRadius() +", a height of "
                + this.height+", an area of "
                + this.getArea() + " and " + this.getColor();
    }
}
