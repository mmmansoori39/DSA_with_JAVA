import java.util.*;

public class FindX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];
        int x= 12;

        // take input from user
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // matching given x value to the arr
        for (int i=0; i<arr.length; i++){
            if (x== arr[i]){
                System.out.println(i);
            }
        }
    }
}
