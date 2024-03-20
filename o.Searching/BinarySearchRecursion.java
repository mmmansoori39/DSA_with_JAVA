public class BinarySearchRecursion {

    public static int recursiveSearch(int arr[], int target, int low , int high){

        if(low > high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(arr[mid] == target){
            return mid;
        } 
        else if(arr[mid] > target){
            return recursiveSearch(arr, target, low, mid-1);
        }
        else {
            return recursiveSearch(arr, target, mid+1, high);
        }

    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 2;

        int idx = recursiveSearch(arr, target, 0, arr.length-1);

        System.out.println("The target element "+target+" is found at index "+idx);
    }
}
