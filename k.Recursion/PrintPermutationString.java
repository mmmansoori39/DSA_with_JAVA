// print all permutations of a string

public class PrintPermutationString {
    public static void printPermutation( String str, String permutation){
        // time compexity is O(n!)
        // base case
        if ( str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for ( int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, permutation+current);
        }
    }
    public static void main(String[] args) {
        String str = "abcde";
        printPermutation(str, "");
    }
}
