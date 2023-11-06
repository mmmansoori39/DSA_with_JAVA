import java.util.*;

public class FirstClass {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();

        // defining 2d array
        int arr[][] =new int [rows][cols];

        // taking values from user and inserting into array

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // for printing output

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}