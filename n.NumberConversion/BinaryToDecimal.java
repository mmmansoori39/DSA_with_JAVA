public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1011;
        int i = 0;
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                ans = (int) Math.pow(2, i) + ans;
            }
            n = n/10;
            i++;
        }
        System.out.println(ans);
    }
}
