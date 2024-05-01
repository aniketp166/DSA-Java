package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class HashingBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Aus", 90);
        hm.put("Pak", 1110);
        hm.put("England", 55);
        // hm.put("India", 99);
        // hm.remove("India", 99);
        // hm.remove("India");

        // System.out.println(hm);
        // System.out.println( hm.get("India"));
        // System.out.println(hm.get("india"));
        // System.out.println(hm.getOrDefault("india", 200));
        // System.out.println(hm.containsKey("india"));
        // hm.forEach((key, value) -> {
        // System.out.println(key + " --> " + value);
        // });

        // System.out.println(hm.size());

        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(23);
        System.out.println(set);
    }
}
