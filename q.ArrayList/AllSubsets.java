import java.util.*;

public class AllSubsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Iterate through the remaining elements
        for (int i = index; i < nums.length; i++) {
            // Include the current element
            current.add(nums[i]);
            // Generate subsets including the current element
            generateSubsets(nums, i + 1, current, result);
            // Exclude the current element (backtrack)
            current.remove(current.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List <Integer>> subsets = subsets(nums);

        System.out.println("All subsets:");
        // for (List<Integer> subset : subsets) {
        //     System.out.println(subset);
        // }

        System.out.println(subsets);
    }
}
