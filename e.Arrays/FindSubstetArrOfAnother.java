import java.util.HashMap;

public class FindSubstetArrOfAnother {
    //find whether one array is subset of another array

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 5,1};

        Boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    static Boolean isSubset( int arr1[], int arr2[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        //inserting arr1 in hashmap
        for( int num: arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }


        // now checking all elems of arr2 in arr1;

        for ( int num: arr2){
            if( !map.containsKey(num) || map.get(num) == 0){
                return false;
            }

            //decrement frequency
            map.put(num, map.get(num)-1);
        }


        return true;
    }
}
