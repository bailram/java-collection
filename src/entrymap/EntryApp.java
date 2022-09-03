package entrymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Dhimas", "Dhimas");
        map.put("Bayu", "Bayu");
        map.put("Ilham", "Ilham");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println("=====");
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }
        /**
         * =====
         * Key : Bayu
         * Value : Bayu
         * =====
         * Key : Ilham
         * Value : Ilham
         * =====
         * Key : Dhimas
         * Value : Dhimas
         */
    }
}
