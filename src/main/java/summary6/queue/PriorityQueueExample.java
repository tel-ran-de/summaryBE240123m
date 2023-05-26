package summary6.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();

        Random rand = new Random();

        for (int i = 0; i < 7 ; i++) {
            Integer newElement = rand.nextInt(100);
            System.out.println("New element = " + newElement);
            integerQueue.add((new Integer(newElement)));
        }

        System.out.println(integerQueue);

        for (int i = 0; i < 7; i++) {
            System.out.println(integerQueue.poll());
        }
    }
}
