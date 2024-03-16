public class RotationOfAnotherString {
    // check one string is rotation of another string

    static boolean isRotation(String str1, String str2){

        if( str1.length() != str2.length()) return false;

        String concatentedStr = str1 + str1;

        return concatentedStr.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        System.out.println(isRotation(str1, str2));

    }
}
