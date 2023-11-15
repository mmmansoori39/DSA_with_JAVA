public class MoveAllX {
    public static void moveAllX(String str, int idx, int count, String newStr){
        // base case
        if ( idx == str.length()){
            for ( int i=0; i<count; i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(idx);
        if ( current == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else{
            newStr+=current;
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String args[]){
        String str ="abxbxsdcxxs";
        moveAllX(str, 0, 0, "");
    }
}
