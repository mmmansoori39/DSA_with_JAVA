public class PrintKeypadCombination {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String str, int idx, String combination){

        // time complexity is O(4^n)
        // base case
        if ( idx == str.length()){
            System.out.println(combination);
            return;
        }

        char current = str.charAt(idx);
        String mapping = keypad[current - '0'];
        for ( int i=0; i<mapping.length(); i++){
            printCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        String str = "245";
        printCombination(str, 0, "");
    }
}
