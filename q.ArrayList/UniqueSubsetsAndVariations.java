import java.util.*;

public class UniqueSubsetsAndVariations {
    public static Set<String> uniqueSubsets(String str) {
        Set<String> result = new HashSet<>();
        generateSubsets(str, 0, "", result);
        return result;
    }

    private static void generateSubsets(String str, int index, String current, Set<String> result) {
        // Add the current subset to the result
        result.add(current);

        // Iterate through the remaining characters
        for (int i = index; i < str.length(); i++) {
            // Include the current character
            generateSubsets(str, i + 1, current + str.charAt(i), result);
        }
    }

    public static Set<String> uniqueVariations(String str) {
        Set<String> result = new HashSet<>();
        generateVariations(str.toCharArray(), 0, result);
        return result;
    }

    private static void generateVariations(char[] chars, int index, Set<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            // Swap characters
            swap(chars, index, i);
            // Recur for next index
            generateVariations(chars, index + 1, result);
            // Backtrack
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        Set<String> subsets = uniqueSubsets(str);
        Set<String> variations = uniqueVariations(str);

        System.out.println("Unique subsets of \"" + str + "\":");
        for (String subset : subsets) {
            System.out.println(subset);
        }

        System.out.println("\nUnique variations of \"" + str + "\":");
        for (String variation : variations) {
            System.out.println(variation);
        }
    }
}
