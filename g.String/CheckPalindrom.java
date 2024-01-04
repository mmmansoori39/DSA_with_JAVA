public class CheckPalindrom {

    public static int checkPalindrome(String name){

        int s= 0;
        int e = name.length()-1;

        while(s<e){
            if( name.charAt(s) == name.charAt(e)){
                s++;
                e--;
            }
            else{
                return -1;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        String name = "nophjpon";
        System.out.println(checkPalindrome(name));
    }
}
