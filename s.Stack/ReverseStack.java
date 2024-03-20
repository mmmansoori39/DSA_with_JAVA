import java.util.Stack;

public class ReverseStack {

    public static void pushAtButton(int data, Stack<Integer> s){

        // base case
        if ( s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtButton(data, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){

        // base case
        if ( s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);

        pushAtButton(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        System.out.println(s);

        reverseStack(s);

    //    System.out.println(s);
    }
}
