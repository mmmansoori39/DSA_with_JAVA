import java.util.*;

public class PreviousLargestElement {

    public static ArrayList<Integer> previousLargestElement(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        // main code of the problem 

        for(int i=0; i<n; i++){
            if(s.isEmpty()){
                list.add(-1);
            }
            else if(arr[i]<s.peek()){
                list.add(s.peek());
            }
            else{
                while (!s.isEmpty() && arr[i]>=s.peek()) {
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

        // Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,4,7,1,0,4};
        System.out.println(previousLargestElement(arr, arr.length));

    }
}
