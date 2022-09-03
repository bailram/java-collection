package legacycollection;

import java.util.*;

public class LegacyCollectionApp {
    public static void main(String[] args) {
        // Vector
        List<String> names = new Vector<>();
        names.add("Dhimas");
        names.add("Bayu");
        names.add("Ilham");

        for (var name : names) {
            System.out.println(name);
        }
        /**
         * Dhimas
         * Bayu
         * Ilham
         */
        System.out.println();

        // HashTable
        Map<String, String> map = new Hashtable<>();
        map.put("Dhimas", "Dhimas");
        map.put("Bayu", "Bayu");
        map.put("Ilham", "Ilham");

        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /**
         * Bayu : Bayu
         * Ilham : Ilham
         * Dhimas : Dhimas
         */
        System.out.println();

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("Dhimas");
        stack.push("Bayu");
        stack.push("Ilham");

        for (var name = stack.pop(); name != null; name = stack.pop()) {
            System.out.println(name);
        }
        /**
         * Ilham
         * Bayu
         * Dhimas
         * Exception in thread "main" java.util.EmptyStackException
         * 	at java.base/java.util.Stack.peek(Stack.java:102)
         * 	at java.base/java.util.Stack.pop(Stack.java:84)
         * 	at legacycollection.LegacyCollectionApp.main(LegacyCollectionApp.java:45)
         */
    }
}
