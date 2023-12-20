public class SquareRoot {
    public static int squareRoot(int n){
        int ans = -1;
        int s = 0, e = n;
        int mid = s + ( e - s)/2;
        while (s<e) {
            int root = mid * mid;
            if ( root == n){
                return mid;
            }
            else if( root > n){
                e = mid - 1;
            }
            else{
                s= mid;
                ans = mid;
            }
            mid = s + (e-s)/2;
        }

        return mid;
    }
    public static void main(String[] args) {
        int n = 34;
        int result = squareRoot(n);
        System.out.println("The squareroot of "+n+" is "+result);
    }
}
