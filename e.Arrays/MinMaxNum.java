import java.util.*;

public class MinMaxNum {
    public static void main(String[] args) {
       
        int arr[] = {12,23,11,4,56};

        

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
