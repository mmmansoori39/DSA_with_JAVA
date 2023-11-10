import java.util.*;

public class FirstString{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        String name = "Md Moinuddin Mansoori";

        String a= "jasmine";
        String b= "jasmine";

        for ( int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }

        // comparing two string

        if (a.compareTo(b) == 0){
            System.out.println("Equal strings");
        }
        else{
            System.out.println("Not equal strings");
        }

        // a > b +ve num
        // a = b 0
        // a < b -ve num

        // but we can also use == for comparing two string but we don't use why?

        if ( a == b){
            System.out.println("Equal strings");
        }
        else{
            System.out.println("Not equal strings");
        }

        // it gave same output so what is the difference let's see

        if ( new String("jasmine") == new String("jasmine")){
            System.out.println("Equal strings");
        }
        else{
            System.out.println("Not equal strings");
        }

        // so finally it gave wrong anser so we use the compareTo() method for comparing two strings insteed of ==;

        // finding substrings

        String sub = name.substring(3, 8);
        System.out.println(sub);
    }

}