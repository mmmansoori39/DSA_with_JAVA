public class PrintNumbers {
    public static void printNumbers(int n){
        if (n==10){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        int n= 1;
        printNumbers(n);
    }
}
