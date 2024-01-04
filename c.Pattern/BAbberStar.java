public class BAbberStar {

    public static void squareNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void squareContiNum(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void triPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void reverseTriNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void charSerial(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    public static void charAlpha(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char ch = (char) ('A' + count - 1);
                count++;
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    public static void mPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' at the borders of 'M'
                if (j == 0 || j == n - 1 // Left and right edges of 'M'
                    || (i == j && i < n / 2) // Left diagonal of 'M'
                    || (i + j == n - 1 && i < n / 2)) { // Right diagonal of 'M'
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        // squareNum(n);
        // squareContiNum(n);
        // triPattern(n);
        // triNum(n);
        // reverseTriNum(n);
        // charSerial(n);
        // charAlpha(n);
        mPattern(n);
    }
}
