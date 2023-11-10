public class GetBits {
    public static void main(String[] args) {
        // get the 3rd bit ( position = 2) of a number n. (n = 0101)
        // Bit mask : 1<<i
        // operation : AND

        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;

        if ( (bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }


    }
}
