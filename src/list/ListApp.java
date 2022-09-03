package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        names.add("Programmer");
        names.add("Zaman");
        names.add("Now");

        names.add(0, "Dhimas");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
    }
}
