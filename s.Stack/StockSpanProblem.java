import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

    public static ArrayList<Integer> stockSpanProblem(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            if(s.isEmpty()){
                list.add(1);
            }
            else if( arr[i] < s.peek()){
                list.add(1);
            }
            else{
                while (!s.isEmpty() && arr[i] >= s.peek()) {
                    s.pop();
                }
                if(s.isEmpty()){
                    list.add(i-s.size()+1);
                }
                else{
                    list.add(i-s.size()+1);
                }
            }
            s.push(arr[i]);
        }

        return list;
    }

    public static void main(String args[]){
        int arr[] = {10, 4, 5, 90, 120, 80};
        int n = arr.length;

        System.out.println(stockSpanProblem(arr, n));

    }
}
