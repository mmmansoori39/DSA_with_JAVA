import java.util.*;

public class IsVailidParentheses {

    public static boolean isValidParentheses(String parneths) {

        Stack<Character> temp = new Stack<>();

        char[] chars = parneths.toCharArray();

        for(char c: chars){
            if(temp.isEmpty()){
                temp.push(c);
            } else if(temp.peek() == '[' && c == ']' || temp.peek() == '{' && c == '}' || temp.peek() == '(' && c == ')'){
                temp.pop();
            } else{
                temp.push(c);
            }
        }



        return temp.isEmpty();
    }

    public static void main(String[] args) {
        String parenths = "[({[[{(([{()}]))}]]})]";

        boolean result = isValidParentheses(parenths);
         System.out.println(result);
    }
}
