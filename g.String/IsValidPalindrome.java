public class IsValidPalindrome {

    public static boolean isvalidpalindrome(String str){

        String cleanedString = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = cleanedString.length()-1;

        while (left<right) {
            if(cleanedString.charAt(left) != cleanedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man, ab plan, a canal: Panama";

        System.out.println(isvalidpalindrome(str));

    }
}
