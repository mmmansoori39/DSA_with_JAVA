import java.util.*;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // taking elements in array from user
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if ( min > arr[i]){
                min = arr[i];
            }
            if ( max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Smallest number is: "+ min);
        System.out.println("Largest number is: "+ max);
    }
}
