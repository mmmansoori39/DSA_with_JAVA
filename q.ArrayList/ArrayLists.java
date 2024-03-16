import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String Args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(6);
        list.add(3);

        System.out.println(list);

        // get elements
         int element = list.get(2);
         System.out.println(element);

         // add element in between
         list.add(2,7);
         System.out.println(list);

         // set element
         list.set(0, 8);
         System.out.println(list);

         // delete elemnt
         list.remove(4);
         System.out.println(list);

         int size = list.size();
         System.out.println("Size of list is "+size);

         Collections.sort(list);
         System.out.println(list);



    }
}
