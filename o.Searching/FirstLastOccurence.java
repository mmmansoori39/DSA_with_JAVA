public class FirstLastOccurence {

    public static int firstOccurence(int arr[], int n, int key) {
        int ans = -1;
        int s = 0, e = n - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }

        return ans;
    }

    public static int lastOccurence(int arr[], int n, int key) {
        int ans = -1;
        int s = 0, e = n - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 7, 8, 10 };
        int n = arr.length;
        int key = 4;
        int first = firstOccurence(arr, n, key);
        int last = lastOccurence(arr, n, key);
        System.out.println("The first occurence at index "+first);
        System.out.println("The last occurence at index "+last);
    }
}
