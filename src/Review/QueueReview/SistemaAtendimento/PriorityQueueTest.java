package Review.QueueReview.SistemaAtendimento;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> priority = new PriorityQueue<>();
        for (int i = 5; i > 0; i--){
            priority.add(i);
        }
        System.out.println(priority);
        priority.offer(0);
        System.out.println(priority);
    }
}
