public class CalcPower {

    // stack height = n
    public static int calcPower(int x, int n){

        // base case 1
        if ( n == 0){
            return 1;
        }

        // base case 2
        if ( x== 0){
            return 0;
        }

        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    // stack height = logn
    public static int calcPower1(int x, int n){

        // base case 1
        if ( n == 0){
            return 1;
        }

        // base case 2
        if ( x== 0){
            return 0;
        }
        // if n is even then
        if ( n%2 == 0){
            return calcPower1(x, n/2)*calcPower1(x, n/2);
        }
        else{
            return calcPower1(x, n/2)*calcPower1(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int result = calcPower(2, 5);
        int result1 = calcPower1(2, 5);
        System.out.println(result);
        System.out.println(result1);
    }
}
