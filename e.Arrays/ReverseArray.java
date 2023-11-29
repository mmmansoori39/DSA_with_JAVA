public class ReverseArray {
    public static void reverseArray(int arr[], int n){
        int start = 0;
        int end = n-1;
        while(start<=end){
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,-2,12,21};
        reverseArray(arr, arr.length);
    }
}
