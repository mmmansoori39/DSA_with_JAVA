public class Setbits {
    public static void main(String[] args) {
        // set the 2rd bit ( position = 1) of a number n. (n = 0101)
    // Bit mask : 1<<i
    // operation : OR

    int n = 5;
    int pos = 1;
    int bitMask = 1<<pos;

    int output = bitMask | n;
    System.out.println(output);
    }

}
