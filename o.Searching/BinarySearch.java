public class BinarySearch {
    public static int binarySearch(int arr[], int key, int n) {

        // time complexity is O(logn)

        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 12, 15, 23, 42, 45, 67, 76 };
        int key = 8;
        int n = arr.length;
        int result = binarySearch(arr, key, n);
        System.out.println("The key " + key + " is present at index " + result);
    }
}
