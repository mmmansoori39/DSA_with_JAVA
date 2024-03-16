public class MergeTwoSortedArr {

    public static void mergeTwoSortedArr( int arr1[], int arr2[], int n1, int n2, int arr3[]){

        int i=0, j=0, k=0;

        while (i<n1 && j<n2) {
            if(arr1[i]< arr2[j]){
                arr3[k++]= arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i<n1) {
            arr3[k++] = arr1[i++];
        }
        while (j<n2) {
            arr3[k++] = arr2[j++];
        }

        // print new array;
        for ( int l= 0; l<arr3.length; l++){
            System.out.print(arr3[l]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,12};
        int arr2[] = { 3,5,6,7,12,34,56,77};

        int n1= arr1.length;
        int n2 = arr2.length;

        int arr3[] = new int[n1+n2];

        mergeTwoSortedArr(arr1, arr2, n1, n2, arr3);

    }
}
