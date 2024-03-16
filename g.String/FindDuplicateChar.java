import java.util.HashMap;

public class FindDuplicateChar {

    public static HashMap<Character, Integer> findDuplicatee(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for(char charVal: chars){
            map.put(charVal,map.getOrDefault(charVal, 0)+1);
        }


        return map;
    }

    public static void printDuplicateChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char charVal : chars) {
            map.put(charVal, map.getOrDefault(charVal, 0) + 1);
        }

        // Print duplicate characters along with their counts
        System.out.println("Duplicate characters:");
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " - " + map.get(key));
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabceabcel";

        System.out.println(findDuplicatee(str));
        printDuplicateChars(str);

    }
}
