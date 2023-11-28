public class Power {
    public static void main(String[] args) {
        int n = 12;

        while (n != 0) {
            int bit = n&1;
            n>>>=1;
            System.out.println(bit + " "+n);
        }
    }
}
