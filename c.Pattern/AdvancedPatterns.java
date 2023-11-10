import java.util.*;

public class AdvancedPatterns {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int n = 8;

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - (i * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - (i * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // for upper satrs
        for (int i = 1; i <= n / 2; i++) {
            // for spaces
            for (int j = 1; j <= (n / 2) - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // for lower stars
        for (int i = n/2; i>0; i--) {
            // for spaces
            for (int j = 1; j <= (n / 2) - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
