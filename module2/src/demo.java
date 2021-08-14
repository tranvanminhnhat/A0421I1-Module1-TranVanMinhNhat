import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 5, 6};
        System.out.println("mảng cũ: ");
        for (int k:i){
            System.out.println(k + "\t");
        }

        int[] i1 = Arrays.copyOf(i,10);
        i1[5] = 7;
        i1[6] = 8;
        i1[7] = 9;
        System.out.println("mảng sao chép");
        for (int k:i1){
            System.out.println(k + "\t");
        }
    }
}
