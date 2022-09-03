package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Dhimas");
        names.add("Bayu");
        names.addAll(Arrays.asList("Ilham", "Ramadhan"));
        names.addAll(List.of("Bailram"));

        System.out.println("ADD");
        print(names);

        System.out.println();
        names.remove("Bailram");
        System.out.println("REMOVE");
        print(names);

        System.out.println();
        System.out.println("CONTAIN");
        System.out.println(names.contains("Dhimas"));
        System.out.println(names.containsAll(List.of("Bayu", "Ilham")));
        System.out.println(names.containsAll(List.of("Ramadhan", "Bailram")));
    }

    static void print(Collection<String> names) {
        for (var name :
                names) {
            System.out.println(name);
        }
    }
}
