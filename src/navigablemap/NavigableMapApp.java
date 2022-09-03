package navigablemap;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Dhimas", "Dhimas");
        map.put("Bayu", "Bayu");
        map.put("Ilham", "Ilham");

        System.out.println(map.lowerKey("Dhimas"));
        System.out.println(map.higherKey("Dhimas"));
        /**
         * Bayu
         * Ilham
         */

        // immutable
        NavigableMap<String, String> emptyImmutableMap = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutableMap = Collections.unmodifiableNavigableMap(map);
    }
}
