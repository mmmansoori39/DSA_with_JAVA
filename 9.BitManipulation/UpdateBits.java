import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        // Update the 2rd bit ( position = 1) of a number n. (n = 0101)

        // for 1 to make 0
        // Bit mask : 1<<i
        // operation : AND with NOT

        // for 0 to make 1
        // Bit mask : 1<<i
        // operation : OR

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); // update bit to 1 else update bit to 0

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask | n;
            System.out.println(newBitMask);
        }

    }
}
