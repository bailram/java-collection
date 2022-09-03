package abstractcollection;

import java.util.Queue;

public class AbstractCollectionApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();
        queue.offer("Dhimas");
        queue.offer("Bayu");
        queue.offer("Ilham");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        /**
         * 1
         * Dhimas
         * Dhimas
         * null
         * 0
         */
    }
}
