package l22_demo.demo_sub;

public class Main {
    public static void main(String[] args) {
        demo3 demo3 = new demo3();

        demo3 demo31 = new demo3("ID123");

        demo3 demo32 = new demo3("456");
        demo31.setStuID("ID124");
        System.out.println(demo3.getStuID());
    }
}
