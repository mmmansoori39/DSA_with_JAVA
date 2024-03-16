import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // put function is used  to add new value

        map.put("India", 123);
        map.put("China", 432);
        map.put("USA", 653);
        
        System.out.println(map);

        for( Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
