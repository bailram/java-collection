package iterabledaniterator;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Dhimas", "Bayu", "Ilham", "Ramadhan");

        for (var name :
                names) {
            System.out.println(name);
        }
    }
}
