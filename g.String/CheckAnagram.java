import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {
    static boolean isAnagram( String s1, String s2){

        // removing sapece and converting in lowercase

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()) return false;

        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);


        return Arrays.equals(charArr1, charArr2);
    }

    public static boolean areAnagrams(String str1, String str2) {

        // Remove spaces and convert strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Count occurrences of each character in str1
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement count for each character in str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // If a character is not present in str1, they cannot be anagrams
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c); // Remove the character if its count becomes zero
            }
        }

        // If the map is empty, all characters in str2 were accounted for in str1
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1, s2));
        System.out.println(areAnagrams(s1, s2));
    }
}
