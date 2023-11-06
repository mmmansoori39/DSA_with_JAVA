import java.util.*;

public class LowerTriangularMatrix{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for ( int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                int elements = sc.nextInt();
                arr[i][j] = elements;
            }
        }

        // printing matrix

        if ( rows != cols){
            System.out.println("Matrix should be a square matrix");
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // printing lower triangle matrix
        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if ( j > i){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            System.out.println();
        }
    }
}