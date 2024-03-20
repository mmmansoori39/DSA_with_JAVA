import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PracticeDemo {

    public static ArrayList<Integer> previouslargestElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (s.isEmpty()) {
                list.add(-1);
            } else if (arr[i] < s.peek()) {
                list.add(s.peek());
            } else {
                while (!s.empty() && arr[i] >= s.peek()) {
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

        return list;
    }

    public static ArrayList<Integer> nearestSmallerToLeft(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length - 1; i++) {
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

        return list;
    }

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

    public static ArrayList<Integer> stockSpanProblem(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (s.isEmpty()) {
                list.add(i - s.size() + 1);
            } else if (arr[i] < s.peek()) {
                list.add(1);
            } else {
                while (!s.isEmpty() && arr[i] >= s.peek()) {
                    s.pop();
                }


                if (s.isEmpty()) {
                    list.add(i - s.size() + 1);
                } else {
                    list.add(i - s.size() + 1);
                }
            }

            s.push(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 4, 5, 90, 120, 80 };

        // System.out.println(previouslargestElement(arr));
        // System.out.println(nearestSmallerToLeft(arr));
        // System.out.println(nearestSmallerToRight(arr));
        System.out.println(stockSpanProblem(arr));

    }
}