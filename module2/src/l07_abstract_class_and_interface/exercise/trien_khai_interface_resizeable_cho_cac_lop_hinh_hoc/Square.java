package l07_abstract_class_and_interface.exercise.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle implements Resizeable{
    public Square(){
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + this.getSide() +
                ", color=" + this.getColor() +
                ", filled=" + this.isFilled() +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }
}
