package l111_demo;



public class demo {
    String x;
    public demo(String x){
        this.x = x;
    }

    public void calculate(demo a, demo b){
        a = b;
        b.x = "0";
        System.out.println(a.x);
    }

    public static void main(String[] args) {
        demo a = new demo("a");
        demo b = new demo("b");
        demo m = new demo("m");
        m.calculate(a,b);
        System.out.println(a.x);
        System.out.println(b.x);
    }
}
