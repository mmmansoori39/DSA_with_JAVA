import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        // explaination with example
        // lets take an array 7 8 3 1 2
        // compare one by one elements if the first elem is smaller than second then
        // keep it as it is other wise change both positions

        // Scanner sc = new Scanner(System.in);
        int arr[] = { 7, 8, 3, 1, 2, 5 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // make a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // for printing sorted array
        for ( int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
