import java.util.Stack;

public class PushAtButtomElem {

    public static void pushAtButton(int data, Stack<Integer> s){

        // base case
        if( s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtButton(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(3);
        s.push(5);

        pushAtButton(8, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
