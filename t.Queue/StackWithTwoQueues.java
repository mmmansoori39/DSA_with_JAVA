import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackWithTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Dequeue elements from queue1 to queue2 until only one element is left
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // Remove and return the last element from queue1
        int popped = queue1.poll();

        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return popped;
    }

    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Dequeue elements from queue1 to queue2 until only one element is left
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // Get the last element from queue1
        int top = queue1.peek();

        // Enqueue the last element into queue2
        queue2.offer(queue1.poll());

        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackWithTwoQueues stack = new StackWithTwoQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top of stack: " + stack.top()); // 3
        System.out.println("Popped: " + stack.pop()); // 3
        System.out.println("Top of stack: " + stack.top()); // 2
    }
}
