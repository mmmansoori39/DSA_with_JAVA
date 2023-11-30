public class PairSum {
    public static void pairSum(int arr[], int target){
        int n = arr.length;
        for ( int i=0; i<n; i++){
            int element = arr[i];
            for ( int j=i+1; j<n; j++){
                if ((element+arr[j]) == target){
                    System.out.println(element+" + "+arr[j]+" = "+target);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 7, 4, 6 };
        int target = 8;
        pairSum(arr, target);
    }
}
