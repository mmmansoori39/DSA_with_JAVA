import java.util.*;

class FirstClass {
    /**
     * @param args
     */
    public static void main(String args[]) {
        // System.out.println("MMM");
        // System.out.println("*\n**\n***\n****");

        // // variables
        // String name = "MOinuddin";
        // int age= 21;
        // double price= 23.43;
        // int a=10;
        // int b=34;

        // name="Jasmine";
        // b=5;
        // int cal = (a*b)/(a-b);
        // int sum=a+b;
        // System.out.println(sum);
        // System.out.println(cal);


        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println(name);
        }

    }
}