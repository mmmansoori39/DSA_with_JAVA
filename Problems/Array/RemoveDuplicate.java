import java.util.*;

public class RemoveDuplicate {

    public static int removeDuplicateElements(int arr[], int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int tempArr[] = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArr[j] = arr[i];
                j++;
            }
        }

        tempArr[j] = arr[n - 1];


        // changing original array
        for (int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }

        return j;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // getting elements in array

        for (int i = 0; i < n; i++) {
            int elem = sc.nextInt();
            arr[i] = elem;
        }

        // printing inserted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int length = removeDuplicateElements(arr, n);

        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
