public class PracticeDemo {

    public static void bubbleSort(int arr[]){
        for ( int i=0; i<arr.length-1; i++){
            for ( int j=0; j<arr.length-i-1; j++){
                if ( arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // for printing sorted array
        for ( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void printStar(int n){
        for(int i=0; i<n; i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 7, 4, 9, 12, 4, 23 };
        // bubbleSort(arr);
        printStar(6);

    }
}
