import java.util.*;

public class Jitu {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        // int x=5;

        for (int i=x; i>0; i--){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=0; j<2*(x-i); j++){
                System.out.print("*");
            }
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();


        // for second pattern

        for (int i=1; i<=x; i++){
            for (int j=1; j<=x; j++){
                if ((i+j)%2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }


    }
}