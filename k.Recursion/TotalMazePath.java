// count total paths in a maze to move from (0,0) to (n,m)
public class TotalMazePath {

    public static int countMazePath(int i, int j, int n, int m){

        // base case 1
        if ( i == n || j == m){
            return 0;
        }
        // base case 2
        if ( i == n-1 && j == m-1){
            return 1;
        }

        // move downwards
        int downPaths = countMazePath(i+1, j, n, m);

        // move rightwards
        int rightPaths = countMazePath(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 12;
        int m = 12;
        System.out.println(countMazePath(0, 0, n, m));
    }
}
