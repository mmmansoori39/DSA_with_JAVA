import java.util.*;

public class MatrixMultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // first matrix
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int mat1[][] = new int[r1][c1];

        // now inserting elements in the first matrix
        for ( int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                mat1[i][j]= sc.nextInt();
            }
        }

        // second matrix
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int mat2[][] = new int[r2][c2];

        // now inserting elements in the second matrix
        for ( int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                mat2[i][j]= sc.nextInt();
            }
        }

        if (c2 != r1){
            System.out.println("Invalid matrix");
            return;
        }

        int mat3[][] = new int[r1][c2];

        for (int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for (int k=0; k<c2; k++){
                    mat3[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }

        // printing resultant values

        for (int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                System.out.print(mat3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
