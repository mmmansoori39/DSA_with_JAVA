public class BitwiseOperation {
    public static void main(String[] args) {
        int a = 3, b = 71;
        int result = a | b;
        int result1 = ~a;
        // System.out.println(result);
        // System.out.println(result1 );

        int i = 0;
        while( b!=0){
            int bit = b&1;
            b>>>=1;
            System.out.println(bit);
            i++;
        }
    }
}
