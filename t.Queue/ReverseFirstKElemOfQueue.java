// reverse first k element of queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElemOfQueue {

    public static void reverseFirstKElement(Queue<Integer> q, int k){

        if( q == null || k<= 0 || k>q.size()) return;

        Stack<Integer> s = new Stack<>();

        // push the first k element in statck
        for ( int i =0; i< k; i++){
            s.push(q.poll());
        }

        //pop element form the stack

        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

         // Move remaining elements after k to the end of the queue
         for ( int i =0; i< q.size()-k; i++){
            q.offer(q.poll());
         }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k = 3;

        System.out.println("Originol queue: "+ q);
        reverseFirstKElement(q, k);
        System.out.println("Reverse queue: "+q);
    }
    
}
