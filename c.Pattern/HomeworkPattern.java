import java.util.*;

public class HomeworkPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // upper butter

        for (int i=1; i<=n/2; i++){
            System.out.print("*");
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }
            for (int j=1; j<=n-2*i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }

            System.out.println();
        }

        // lowe butter

        for (int i=n/2; i>=1; i--){
            System.out.print("*");
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }
            for (int j=1; j<=n-2*i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
