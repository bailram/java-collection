package binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            numbers.add(i);
        }

        int index = Collections.binarySearch(numbers, 500);
        System.out.println(index);
        /**
         * 499
         */

        Comparator<Integer> copmaratorInteger = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(numbers, 500, copmaratorInteger);
        System.out.println(index2);
        /**
         * 499
         */
    }
}
