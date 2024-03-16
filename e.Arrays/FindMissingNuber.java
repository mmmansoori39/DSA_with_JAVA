public class FindMissingNuber {
    public static int missingElem(int arr[], int n){
        int num = 0;

        int totalSum = n* (n+1)/2;

        for ( int i=0; i<n-1; i++){
            totalSum -= arr[i];
        }

        return totalSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,6,7};
        int n = 8;

        System.out.println(missingElem(arr, n));

    }
}
