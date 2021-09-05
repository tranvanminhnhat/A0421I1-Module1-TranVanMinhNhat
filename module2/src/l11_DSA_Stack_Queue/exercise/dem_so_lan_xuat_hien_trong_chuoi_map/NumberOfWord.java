package l11_DSA_Stack_Queue.exercise.dem_so_lan_xuat_hien_trong_chuoi_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberOfWord {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String[] word = str.split(" ");

        for (String element : word){
            if (map.containsKey(element.toUpperCase())){
                map.put(element.toUpperCase(), map.get(element.toUpperCase()) + 1);
            }else {
                map.put(element.toUpperCase(), 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.printf("%s appears %d time\n", entry.getKey(), entry.getValue().intValue());
        }
    }
}
