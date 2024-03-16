public class PracticeDemo{

    public static boolean isPalindrome( String str){

        int right = 0, left = str.length() - 1;

         while (right< left) {
            if(str.charAt(right) == str.charAt(left)){
                right++;
                left--;
            } else{
                return false;
            }
         }

         return true;

    }

    public static String reverseString( String str){

        char[] chars = str.toCharArray();

        int s=0, e = chars.length - 1;

        while (s<e) {
            
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            s++;
            e--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "jasmine";

        // boolean isPalindrome = isPalindrome(str);

        // if(isPalindrome){
        //     System.out.println("yes");
        // } else{
        //     System.out.println("No");
        // }

        String result = reverseString(str);
        System.out.println(result);

    }

    
}