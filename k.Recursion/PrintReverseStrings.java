public class PrintReverseStrings {
    public static void reverseString(String str, int idx){
        // base case
        if ( idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }
    
    public static void main(String[] args) {
        String str = "abcdefghijk";
        reverseString(str, str.length()-1);
    }
}
