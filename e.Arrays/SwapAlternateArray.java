public class SwapAlternateArray {
    public static void swapAlternateArray(int arr[], int n){
        for(int i=0; i<n-1; i+=2){
            int swap = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = swap;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,7,3,5,9};
        swapAlternateArray(arr, arr.length);
    }
}
