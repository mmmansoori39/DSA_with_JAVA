import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallerToLeft {

    public static ArrayList<Integer> nearestSmallerToLeft(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i>=0; i--){
            if(s.isEmpty()){
                list.add(-1);
            }
            else if( arr[i] > s.peek()){
                list.add(s.peek());
            }
            else{
                while (!s.isEmpty() && arr[i] <= s.peek()) {
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
        int arr[] = {2,4,3,6,1,0,5};
        int n = arr.length;

        System.out.println(nearestSmallerToLeft(arr, n));
    }
}
