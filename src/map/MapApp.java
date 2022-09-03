package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapApp {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("firstName", "Dhimas");
        hashMap.put("lastName", "Bayu");

        System.out.println(hashMap.get("firstName"));
        System.out.println(hashMap.get("lastName"));
        /**
         * Dhimas
         * Bayu
         */
        System.out.println();

        // WeakHashMap
        Map<Integer, Integer> weakHashMap = new WeakHashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            weakHashMap.put(i, i);
        }

        System.gc();
        System.out.println(weakHashMap.size());
        /**
         * 1827035
         */
        System.out.println();

        // IdentityHashMap
        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        Map<String, String> identityHasHMap = new IdentityHashMap<>();
        identityHasHMap.put(key1, "Dhimas Bayu");
        identityHasHMap.put(key2, "Ilham Ramadhan");

        System.out.println(identityHasHMap.size());
    }
}
