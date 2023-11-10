public class FactorialN {
    public static void calcFactorial(int n, int i, int fact){
        if ( i<=n){
            fact*=i;
            calcFactorial(n, i+1, fact);
        }
        else{
            System.out.println("The factorial of "+n+" is "+fact);
            return;
        }
    }

    // other way
    public static int printFact(int n){
        if ( n==1 || n==0){
            return 1;
        }
        int fact_nm1= printFact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }


    public static void main(String[] args) {
        calcFactorial(5, 1, 1);
        System.out.println(printFact(5));
    }
}
