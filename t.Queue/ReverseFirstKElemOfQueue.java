// reverse first k element of queue

import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElemOfQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println(q);
    }
    
}
