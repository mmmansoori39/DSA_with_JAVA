import java.util.*;

public class LinkedLists {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        // only add is used to add elements in the last
        list.add("first");

        System.out.println(list);

        list.addLast("list");
        list.add("yes");

        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        // for printing list item one by one

        for ( int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // deleting item;

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
