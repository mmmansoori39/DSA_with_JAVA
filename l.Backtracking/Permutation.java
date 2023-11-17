public class Permutation {
    public static void permutationPrint(String str, String permutation){
        // time complexity is O(n*n!)
        if ( str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for ( int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutationPrint(newStr, permutation+current);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permutationPrint(str, "");
    }
}
