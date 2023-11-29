public class LinearSearch {

    public static boolean linearSearch( int arr[], int size, int key){
        for( int i=0; i<size; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {-12, 23, 43, -4, 9, 0, 24};
        int key = 63;
        boolean result = linearSearch(arr, arr.length, key);
        if(result){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }
    }
}