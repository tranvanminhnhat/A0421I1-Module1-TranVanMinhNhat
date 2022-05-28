package l22_demo.demo_sub;

public class DemoNew {
    public static void main(String[] args) {
        System.out.println(switchIt(4));
    }
    public static int switchIt(int x){
        int j = 1;
        switch (x){
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            default:
                j++;
        }
        return j + x;
    }
}

