package map;

import java.util.*;

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
        /**
         * 2
         */
        System.out.println();

        // LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("firstname", "Dhimas");
        linkedHashMap.put("lastname", "Bayu");

        for (var key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
        /**
         * firstname
         * lastname
         */

        for(var value : linkedHashMap.values()) {
            System.out.println(value);
        }
        /**
         * Dhimas
         * Bayu
         */
        System.out.println();

        // EnumMap
        EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.FREE, "Gratis");
        enumMap.put(Level.PREMIUM, "Berbayar");

        System.out.println(enumMap.get(Level.FREE));
        System.out.println(enumMap.get(Level.PREMIUM));
        /**
         * Gratis
         * Berbayar
         */
    }

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }
}
