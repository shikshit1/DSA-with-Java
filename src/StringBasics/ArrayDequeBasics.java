package StringBasics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(20);
        System.out.println(q);
    }


}
