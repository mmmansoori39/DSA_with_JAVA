public class ClearBits {
    public static void main(String[] args) {
        // set the 3rd bit ( position = 2) of a number n. (n = 0101)
        // Bit mask : 1<<i
        // operation : AND with NOT

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMAsk = ~bitMask;

        int output = notBitMAsk & n;
        System.out.println(output);

    }
}
