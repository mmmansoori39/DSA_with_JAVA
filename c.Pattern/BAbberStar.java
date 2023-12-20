public class BAbberStar {

    public static void squareNum(int n){
        for ( int i=1; i<=n; i++){
            for( int j=1; j<=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void squareContiNum(int n){
        int a=1;
        for ( int i=0; i<n; i++){
            for ( int j=1; j<=n; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public static void triPattern(int n){
        for ( int i=1; i<=n; i++){
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triNum(int n){
        for ( int i=1; i<=n; i++){
            for ( int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int n = 8;
        // squareNum(n);
        // squareContiNum(n);
        triPattern(n);
        triNum(n);
    }
}
