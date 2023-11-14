public class TowerOfHanoi {

    public static void towerOfHanoi( int n, String src, String helper, String dest ){

        // time complexity is 2^n


        // base case
        if ( n==1){
            System.out.println("Transfer disc "+ n + " from "+ src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disc "+ n + " from "+ src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
}
