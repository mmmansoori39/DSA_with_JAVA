import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextLargestElement {

    /**
     * @param arr
     * @param n
     */
    public static ArrayList<Integer> nextLargestElement(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){
            // if stack is empty
            if(s.isEmpty()){
                list.add(-1);
            }
            else if( arr[i]<s.peek()){
                list.add(s.peek());
            }
            else{
                while (!s.isEmpty() && s.peek()<=arr[i]) {
                    s.pop();
                }

                if(s.isEmpty()){
                    list.add(-1);
                }
                else{
                    list.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,0,5,2};
        System.out.println(nextLargestElement(arr, arr.length));
    }
}
