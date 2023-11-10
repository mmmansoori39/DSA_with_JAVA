public class SumOfNNumbers {

    public static void printSum(int i, int n, int sum){
        if ( i<=n){
            sum+=i;
            System.out.println(sum);
            printSum(i+1, n, sum);
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
    
}
