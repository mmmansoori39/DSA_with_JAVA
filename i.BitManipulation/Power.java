public class Power {
    public static void main(String[] args) {
        int n = 12;

        while (n != 0) {
            int bit = n & 1;
            n >>>= 1;
            if (bit == 1 && n == 0) {
                System.out.println(bit+"yes");
            }

        }
    }
}
