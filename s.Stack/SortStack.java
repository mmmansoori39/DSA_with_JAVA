import java.util.*;

public class SortStack {

    public static void sortStack(Stack<Integer> s){

        // base case
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();

        sortStack(s);

        insertSortedElem(s, top);
    }

    public static void insertSortedElem(Stack<Integer> s, int elem){

        if(s.isEmpty() || elem> s.peek()){
            s.push(elem);
        } else {
            int top = s.pop();

            insertSortedElem(s, elem);

            s.push(top);
        }
    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(5);
        s.push(7);
        s.push(2);
        s.push(6);
        s.push(2);

        System.out.println(s);
        
        sortStack(s);

        System.out.println(s);
        
    }
}
