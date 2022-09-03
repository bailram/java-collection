package sortedset;

import immutablelist.Person;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        // kalau pengen dibalik
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("Dhimas"));
        people.add(new Person("Bayu"));
        people.add(new Person("Ilham"));

        for (var person :
                people) {
            System.out.println(person.getName());
        }

        /**
         * output
         * Bayu
         * Dhimas
         * Ilham
         */

        // immutable sortedset
        SortedSet<Person> immutablePeople = Collections.unmodifiableSortedSet(people);
    }
}
