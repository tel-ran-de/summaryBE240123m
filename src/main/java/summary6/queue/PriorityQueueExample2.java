package summary6.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("Word01");
        stringQueue.add("word02");
        stringQueue.add("Word03");
        stringQueue.add("word11");
        stringQueue.add("Word15");

        System.out.println(stringQueue);

        for (int i = 0; i < 5; i++) {
            System.out.println(stringQueue.poll());
        }
    }
}
