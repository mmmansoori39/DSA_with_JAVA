public class TripleSum {
    public static void tripleSum(int arr[], int target){
        int n = arr.length;
        for ( int i=0; i<n; i++){
            for ( int j=i+1; j<n; j++){
                for ( int k=j+1; k<n; k++){
                    if ( (arr[i] + arr[j] + arr[k]) == target){
                        System.out.println(arr[i] +" + "+ arr[j] +" + "+ arr[k]+" = "+target);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,4,8,9,7};
        int target = 15;
        tripleSum(arr, target);
    }
}
