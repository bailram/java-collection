package konversikearray;

import java.util.Arrays;
import java.util.List;

public class KonversiKeArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Dhimas", "Bayu", "Ilham");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
        /**
         * [Dhimas, Bayu, Ilham]
         * [Dhimas, Bayu, Ilham]
         */
    }
}
