package sortedmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("Dhimas", "Dhimas");
        map.put("Bayu", "Bayu");
        map.put("Ilham", "Ilham");

        for (var key : map.entrySet()) {
            System.out.println(key);
        }
        /**
         * Bayu=Bayu
         * Dhimas=Dhimas
         * Ilham=Ilham
         */
        System.out.println();

        // comparator
        SortedMap<Person, String> comparatorMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        comparatorMap.put(new Person("Dhimas"), "Dhimas");
        comparatorMap.put(new Person("Bayu"), "Bayu");
        comparatorMap.put(new Person("Ilham"), "Ilham");

        for (var key : comparatorMap.keySet()) {
            System.out.println(key);
        }
        /**
         * Person{name='Bayu'}
         * Person{name='Dhimas'}
         * Person{name='Ilham'}
         */

        // immutable
        SortedMap<String, String> immutableEmptyMap = Collections.emptySortedMap();

        SortedMap<String, String> immutableSortedMap = Collections.unmodifiableSortedMap(map);
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
