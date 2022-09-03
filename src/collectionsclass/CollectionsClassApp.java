package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Dhimas", "Bayu", "Ilham"));
        System.out.println(names);
        /**
         * [Dhimas, Bayu, Ilham]
         */
        System.out.println();

        Collections.reverse(names);
        System.out.println(names);
        /**
         * [Ilham, Bayu, Dhimas]
         */
        System.out.println();

        Collections.shuffle(names);
        System.out.println(names);
        /**
         *  [Ilham, Dhimas, Bayu]
         */
    }
}
