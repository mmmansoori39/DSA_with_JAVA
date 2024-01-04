public class ArraySorted {

    public static int isSorted(int arr[], int n) {
        int i = 0;
        while (i < n - 1) {
            if (arr[i] == arr[i + 1]) {
                i++;
            }
            else{
                break;
            }
        }
        if (arr[i] < arr[i + 1]) {
            while (i < n - 1) {
                if (arr[i] <= arr[i + 1]) {
                    i++;
                } else {
                    return -1;
                }
            }
            return 1;
        } else if (arr[i] >= arr[i + 1]) {
            while (i < n - 1) {
                if (arr[i] > arr[i + 1]) {
                    i++;
                } else {
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 3, 4, 5, 7 };
        int arr2[] = { 9, 8, 7, 5, 3, 2 };
        // System.out.println(isSorted(arr1, arr1.length));
        System.out.println(isSorted(arr2, arr2.length));

    }
}
