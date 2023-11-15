public class RemoveDuplicates {
    // remove duplicates of a string

    // declaring static array for all alphabets
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr){

        // time compexity is O(n)
        // base case
        if ( idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // check the current char fo string
        char current = str.charAt(idx);
        if ( map[current - 'a']){
            removeDuplicates(str, idx+1, newStr);
        }
        else{
            map[current - 'a'] = true;
            newStr+=current;
            removeDuplicates(str, idx+1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbscxxbs";
        removeDuplicates(str, 0, "");
    }
}
