// print all the unique subsequencesof a string

import java.util.*;
public class PrintUniqueSubsequencesString {
    public static void uniqueSubsequencesOdString(String str, int idx, String newStr, HashSet<String> set){

        // time complexity is O(2^n)

        // base case
        if ( idx == str.length()){
            if ( set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
            }
            return;
        }

        // finding current character of the string
        char current = str.charAt(idx);
        
        // to be
        uniqueSubsequencesOdString(str, idx+1, newStr+current, set);

        // not to be
        uniqueSubsequencesOdString(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequencesOdString(str, 0, "", set);
    }
}
