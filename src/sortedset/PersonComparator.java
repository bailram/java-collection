package sortedset;

import immutablelist.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // sorting asc
        return o1.getName().compareTo(o2.getName());
        // sorting desc
//        return o2.getName().compareTo(o1.getName());
    }
}
