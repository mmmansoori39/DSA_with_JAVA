public class ReverseStrings {

    public static String reverseString( String str){

        char[] chars = str.toCharArray();

        int s=0, e = chars.length - 1;

        while (s<e) {
            
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            s++;
            e--;
        }

        return new String(chars);
    }
    public static void main(String[] args) {
        
        String str = "jasmine";
        System.out.println(reverseString(str));
        




        StringBuilder sb = new StringBuilder("jasmine");
        for ( int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
