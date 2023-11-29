import java.util.*;

public class FindAllDuplicates {
    public static void findAllDuplicates(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();

        for ( int num:arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] ={1,2,5,3,5,2,4};
        findAllDuplicates(arr, arr.length);
    }
}
