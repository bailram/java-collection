package immutablelist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    // mutable list
//    public List<String> getHobbies() {
//        return hobbies;
//    }

    // immutable list
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }
}
