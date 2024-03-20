import java.util.*;

public class FindSubsetArrOfAnother {
    // Find whether one array is a subset of another array

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 5, 1};

        boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    static boolean isSubset(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Inserting arr1 elements into the hashmap
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Checking all elements of arr2 in arr1
        for (int num : arr2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }

            // Decrement frequency
            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}
