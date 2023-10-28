package Pattern;

public class Patterns {
    public static void main(String[] args) {
        // for (int i=0; i<4; i++){
        // for (int j=0; j<4; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // print
        // *****
        // * *
        // * *
        // *****

        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = m; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = m; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        int a = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                a += 1;
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();

        int c=5;
        for (int i=1; i<=m; i++){
            for (int j=1; j<=c-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=c; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=1; i<=m; i++){
            for (int j=1; j<=c-1; j++){
                System.out.print(" ");
            }
            for (int j=i; j>1; j--){
                System.out.print(j);
            }
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            c--;
            System.out.println();
        }

        System.out.println();
        int k=5;
        for (int i=1; i<=m; i++){
            for (int j=1; j<k; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2; j++){
                if (j%2 == 0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
                
            }
            k--;
            System.out.println();
        }
    }
}
