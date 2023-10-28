import java.util.*;

public class FirstFunctions {
    
    public static int calSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void factorialNum(int a){
        if (a>0){
            int fact= 1;
            for (int i=a; i>0; i--){
                fact = fact*i;
            }
            System.out.println("The factorial of "+ a + " is "+ fact);
        }
        else{
            System.out.println("Not a valid number");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum= calSum(a, b);
        // System.out.println("Sum of "+a+ " and "+ b +" is " + sum);
        factorialNum(a);
    }
}
