import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queuesDataStructures {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(35);
        queue.offer(8);



        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(5);
        deque.offer(3);
        deque.offer(2);
        deque.offer(6);
        deque.offer(5);
        deque.addFirst(13);
        System.out.println(deque.poll());

        Queue<Integer> queuePrio = new PriorityQueue<>();
        queuePrio.offer(3);
        queuePrio.offer(2);
        queuePrio.offer(5);
        queuePrio.offer(3);
        queuePrio.offer(7);
        System.out.println();
        System.out.println(queuePrio.poll());
// heap,
        while (!queuePrio.isEmpty()){
            System.out.println(queuePrio.poll());
        }



    }
}
