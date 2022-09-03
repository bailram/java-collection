package immutableset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> emptySet = Collections.emptySet();
        Set<String> one = Collections.singleton("Dhimas");
        Set<String> mutable = new HashSet<>();
        mutable.add("Dhimas");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        Set<String> set = Set.of("Dhimas", "Bayu");
    }
}
