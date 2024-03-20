import java.util.HashMap;

public class CountPairsWithGivenSum {
    
    public static int countPairs(int arr[], int targetSum){

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num: arr){
            int complement = targetSum - num;

            if(map.containsKey(complement)){
                count += map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,5,7,-1,5};
        int targetSum = 6;

        int pairsCount = countPairs(arr, targetSum);
        System.out.println("Number of pairs with sum " + targetSum + ": " + pairsCount);

    }
}
