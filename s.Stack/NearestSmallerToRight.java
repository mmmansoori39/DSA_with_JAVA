import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallerToRight {

    public static ArrayList<Integer> nearestSmallerToRight(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                list.add(-1);
            } else if (arr[i] > s.peek()) {
                list.add(s.peek());
            } else {
                while (!s.isEmpty() && arr[i] <= s.peek()) {
                    s.pop();
                }

                if (s.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 4, 6, 3, 4, 8, 5 };

        System.out.println(nearestSmallerToRight(arr));
    }
}
