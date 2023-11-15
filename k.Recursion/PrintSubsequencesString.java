// print all the subsequencesof a string

public class PrintSubsequencesString {
    public static void subsequencesOdString(String str, int idx, String newStr){

        // time complexity is O(2^n)

        // base case
        if ( idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // finding current character of the string
        char current = str.charAt(idx);
        
        // to be
        subsequencesOdString(str, idx+1, newStr+current);

        // not to be
        subsequencesOdString(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abcd";
        subsequencesOdString(str, 0, "");
    }
}
