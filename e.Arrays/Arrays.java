import java.util.*;

public class Arrays {

    public static void main(String args[]) {
        // int[] arr = new int[3];
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // also we can do it like this

        int marks[] = {10,12,23};

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
            System.out.println(marks[i]);

        }
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);

        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();

        int arr2[]= new int[size];

        // for input
        for (int i=0; i<size; i++){
            arr2[i]= sc.nextInt();
        }
        // output
        for (int i=0; i<size; i++){
            System.out.println(arr2[i]);
        }
    }
}
