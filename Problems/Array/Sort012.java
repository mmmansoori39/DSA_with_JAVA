public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 0, 0, 2, 1, 2, 0, 2, 0, 1, 2, 2, 0, 1 };
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (j <= k) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else if (arr[j] == 2) {
                swap(arr, j, k);
                k--;
            }
        }

        for (int m = 0; m < n; m++) {
            System.out.print(arr[m] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
