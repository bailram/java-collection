package set;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        // hashset
        Set<String> names = new HashSet<>();
        names.add("Dhimas");
        names.add("Bayu");
        names.add("Dhimas");
        names.add("Bayu");

        for (var name :
            names) {
            System.out.println(name);
        }
        System.out.println();
        /**
         * output :
         * Bayu
         * Dhimas
         */

        // linkedhashset
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        namesLinkedHashSet.add("Dhimas");
        namesLinkedHashSet.add("Bayu");
        namesLinkedHashSet.add("Dhimas");
        namesLinkedHashSet.add("Bayu");

        for (var name :
                namesLinkedHashSet) {
            System.out.println(name);
        }
        System.out.println();
        /**
         * output :
         * Dhimas
         * Bayu
         */

        // enumset
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        /**
         * output :
         * MALE
         * FEMALE
         * NOT_MENTION
         */
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
        /**
         * output
         * MALE
         * FEMALE
         */
        for (var gender :
                genders) {
            System.out.println(gender);
        }
    }

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
}
