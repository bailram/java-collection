package immutablemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singletonMap = Collections.singletonMap("Winner", "Dhimas");

        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("firstname", "Dhimas");
        mutableMap.put("lastname", "Bayu");
        Map<String, String> immutableMap = Collections.unmodifiableMap(mutableMap);

        Map<String, String> map = Map.of(
          "firstname", "Dhimas",
                "lastname", "Bayu"
        );

//        map.put("middlename", "D"); // error
    }
}
