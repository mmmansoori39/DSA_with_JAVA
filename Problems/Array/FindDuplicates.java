import java.util.HashSet;

public class FindDuplicates {
    public static int findDuplicate(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        
        return -1; // Return -1 if no duplicate is found
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 6, 8, 2 };
        System.out.println(findDuplicate(arr, arr.length));
    }
}

