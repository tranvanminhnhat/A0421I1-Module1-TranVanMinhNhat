package l06_inheritance.exercise.lop_point2d_va_lop_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        point3D.setZ(4);
        System.out.println(point3D);
    }
}
