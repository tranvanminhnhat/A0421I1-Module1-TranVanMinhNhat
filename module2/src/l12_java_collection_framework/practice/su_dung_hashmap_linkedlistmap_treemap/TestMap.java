package l12_java_collection_framework.practice.su_dung_hashmap_linkedlistmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Smith", 30);
        hashmap.put("Anderson", 31);
        hashmap.put("Lewis", 29);
        hashmap.put("Cook", 29);
        System.out.println("Display entry in hashmap:");
        System.out.println(hashmap);

        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        System.out.println(treeMap.get("Lewis"));

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap.get("Smith"));

    }
}
