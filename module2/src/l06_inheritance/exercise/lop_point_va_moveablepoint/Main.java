package l06_inheritance.exercise.lop_point_va_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,6);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
