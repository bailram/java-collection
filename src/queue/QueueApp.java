package queue;

import java.util.*;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);
        queue.offer("Dhimas");
        queue.offer("Bayu");
        queue.offer("Ilham");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
        /**
         * Bayu
         * Dhimas
         * Ilham
         * 0
         */

        System.out.println();
        System.out.println();
        Queue<QueueDto> queuePriority = new PriorityQueue<>(10, new QueueDtoComparator());

        queuePriority.offer(new QueueDto(1, "Dhimas"));
        queuePriority.offer(new QueueDto(3, "Ilham"));
        queuePriority.offer(new QueueDto(2, "Bayu"));

        List<QueueDto> list = new ArrayList<>();
        for (QueueDto next = queuePriority.poll(); next != null; next = queuePriority.poll()) {
            list.add(next);
            System.out.println(next);
        }

        System.out.println();
        for (var item : list) {
            System.out.println(item);
        }
        /**
         * QueueDto{priority=1, name='Dhimas'}
         * QueueDto{priority=2, name='Bayu'}
         * QueueDto{priority=3, name='Ilham'}
         *
         * QueueDto{priority=1, name='Dhimas'}
         * QueueDto{priority=2, name='Bayu'}
         * QueueDto{priority=3, name='Ilham'}
         */
    }

    static class QueueDto {
        private int priority;
        private String name;

        public QueueDto() {
        }

        public QueueDto(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "QueueDto{" +
                    "priority=" + priority +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    static class QueueDtoComparator implements Comparator<QueueDto> {

        @Override
        public int compare(QueueDto o1, QueueDto o2) {
            if (o2.getPriority() > o1.getPriority()) {
                return -1;
            }
            return 0;
        }
    }
}
