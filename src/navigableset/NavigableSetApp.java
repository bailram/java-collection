package navigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Dhimas", "Bayu", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> dhimas = names.headSet("Dhimas", true);

        for(var name : names) {
            System.out.println(name);
        }

        /**
         * Bayu
         * Dhimas
         * Now
         * Programmer
         * Zaman
         */

        System.out.println();
        for(var name : namesDesc) {
            System.out.println(name);
        }

        /**
         * Zaman
         * Programmer
         * Now
         * Dhimas
         * Bayu
         */

        System.out.println();
        for(var name : dhimas) {
            System.out.println(name);
        }

        /**
         * Bayu
         * Dhimas
         */
    }
}
