public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 180;
        int i = 0;
        int ans = 0;
        while( n!=0){
            int bit = n&1;
            ans = (bit * ((int)Math.pow(10, i))) + ans;
            n>>>=1;
            i++;
        }
        System.out.println(ans);
    }
}
