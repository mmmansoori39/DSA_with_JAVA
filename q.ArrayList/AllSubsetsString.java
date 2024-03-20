import java.util.*;

public class AllSubsetsString {

    public static List<String> allSubsets(String str){
        List<String> result = new ArrayList<>();

        generateSubsets(str, 0, "", result);

        return result;
    }

    private static void generateSubsets(String str, int index, String current, List<String> result){

        // add the current subsets to the result
        result.add(current);

        // iterate through the remaining characters
        for(int i=index; i<str.length(); i++){
            generateSubsets(str, i+1, current+ str.charAt(i), result);
        }

    }

    public static void main(String[] args) {
        
        String str = "abc";
        List<String> subsets = allSubsets(str);

        System.out.println("All subsets of \"" + str + "\":");
        
        for(String subset: subsets){
            System.out.println(subset);
        }
    }
}
