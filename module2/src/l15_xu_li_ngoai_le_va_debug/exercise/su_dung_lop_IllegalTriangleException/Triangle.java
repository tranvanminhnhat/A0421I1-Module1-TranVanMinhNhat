package l15_xu_li_ngoai_le_va_debug.exercise.su_dung_lop_IllegalTriangleException;

public class Triangle {
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle() {
    }

    public Triangle(double side_a, double side_b, double side_c) throws IllegalTriangleException{
        if (side_a <=0 || side_b <= 0 || side_c <= 0){
            throw new IllegalTriangleException("side is smaller than zero");
        }else if (side_a + side_b < side_c || side_a + side_c < side_b || side_b + side_c < side_a){
            throw new IllegalTriangleException("total of two sides is smaller than another side");
        }else {
            this.side_a = side_a;
            this.side_b = side_b;
            this.side_c = side_c;
        }
    }

    public double getSide_a() {
        return side_a;
    }

    public void setSide_a(double side_a) throws IllegalTriangleException{
        if (side_a <= 0){
            throw new IllegalTriangleException(side_a + " is smaller than zero");
        }else {
            this.side_a = side_a;
        }
    }

    public double getSide_b() {
        return side_b;
    }

    public void setSide_b(double side_b) throws IllegalTriangleException{
        if (side_b <= 0){
            throw new IllegalTriangleException(side_b + " is smaller than zero");
        }
        this.side_b = side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    public void setSide_c(double side_c) throws IllegalTriangleException{
        if (side_c <= 0){
            throw new IllegalTriangleException(side_c + " is smaller than zero");
        }else {
            this.side_c = side_c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side_a=" + side_a +
                ", side_b=" + side_b +
                ", side_c=" + side_c +
                '}';
    }
}
