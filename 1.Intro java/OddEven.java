import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num%2 == 0){
        // System.out.println(num + " is an even number");
        // }
        // else{
        // System.out.println(num + " is an odd number");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();

        // if (a==b){
        // System.out.println("a is equal to b");
        // }
        // else{
        // if (a>b){
        // System.out.println("a is greater than b");
        // }
        // else{
        // System.out.println("b is greater than a");
        // }
        // }

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }
}
