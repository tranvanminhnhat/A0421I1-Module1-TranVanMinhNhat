package l04_class_and_object_in_java.exercise.lop_phuong_trinh_bac_hai;

public class QuadraticEquation {
    double a,b,c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(){

    }

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    private double getRoot1(){
        return (-b + Math.sqrt(this.getDiscriminant()))/(2 * this.a);
    }

    private double getRoot2(){
        return (-b - Math.sqrt(this.getDiscriminant()))/(2 * this.a);
    }

    private double getRoot(){
        return -this.b / (2 * this.a);
    }

    public void display(){
        if(this.a == 0){
            if (this.b == 0){
                if (this.c == 0){
                    System.out.println("Quadratic equation has lots of solution");
                }else {
                    System.out.println("Quadratic equation has no solution");
                }
            }else {
                System.out.println("Quadratic equation has one solution is " + -this.c / this.b);
            }
        }else {
            if(this.getDiscriminant() < 0){
                System.out.println("Quadratic equation has no solution");
            }else if(this.getDiscriminant() == 0){
                System.out.println("Quadratic equation has one solution is " + this.getRoot());
            }else {
                System.out.println("Quadratic equation has tow solutions");
                System.out.println("Root 1: " + this.getRoot1());
                System.out.println("Root 2: " + this.getRoot2());
            }
        }
    }
}
