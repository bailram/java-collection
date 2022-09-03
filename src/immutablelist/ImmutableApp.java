package immutablelist;

import java.util.List;

public class ImmutableApp {
    // problem mutable list
    public static void main(String[] args) {
        Person person = new Person("Dhimas");
        person.addHobby("Coding");
        person.addHobby("Speeding");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby :
                person.getHobbies()) {
            System.out.println(hobby);
        }


    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        // ketika dibikin immutable dan ditambahkan data akan throw error
//        hobbies.add("apa aja deh");
    }
}
