import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        //default behaviour -> integers -> jiski value sbse kam hogi uski priority sbse jyda hogi -> isko miniheap khete hai
        //max heap-> Integer->  me hota hai jiski value jyda hogi toh usko hight priority di jayegi
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll()); //remove the head of the queue
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
