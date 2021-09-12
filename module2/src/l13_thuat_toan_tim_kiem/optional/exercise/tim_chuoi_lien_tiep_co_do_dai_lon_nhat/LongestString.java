package l13_thuat_toan_tim_kiem.optional.exercise.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast()
            && list.contains(str.charAt(i))){
                list.clear();
            }
            list.add(str.charAt(i));

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max){
            System.out.print(ch);
        }
        System.out.println();
    }
}
