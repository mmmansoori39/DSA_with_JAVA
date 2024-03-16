public class ReverseNumber {

    static int reverseNumber( int num){

        int reverse = 0, remainder;

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse* 10 + remainder;
            num /= 10;
        }

        return reverse;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverseNumber(num));
    }
}
