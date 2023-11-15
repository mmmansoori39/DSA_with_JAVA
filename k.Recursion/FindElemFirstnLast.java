// find the first and last occurance of an element in string

public class FindElemFirstnLast {
    public static int first = -1;
    public static int last = -1;

    public static void elementOccurance( String str, int idx, char element){

        // time complexity is O(n)

        // base case
        if ( idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currElem = str.charAt(idx);
        if ( currElem == element){
            if ( first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        elementOccurance(str, idx+1, element);
    }
    public static void main(String args[]) {
        String str = "abcsaba";
        elementOccurance(str, 0, 'a');
    }
}
