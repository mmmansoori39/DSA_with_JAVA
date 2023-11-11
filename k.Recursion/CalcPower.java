public class CalcPower {
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
    public static void main(String[] args) {
        int result = calcPower(2, 5);
        System.out.println(result);
    }
}
