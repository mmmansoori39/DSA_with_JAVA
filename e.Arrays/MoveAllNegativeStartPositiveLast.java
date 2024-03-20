public class MoveAllNegativeStartPositiveLast {

    public static void moveAllNegativePositive(int arr[]) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            // find the next negative number from start
            while (i <= j && arr[i] < 0) {
                i++;
            }

            // find the next positive nuber from end
            while (i <= j && arr[j] >= 0) {
                j--;
            }

            // Swap if both negative and positive numbers are found
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 4, 7, 8, -4, -5, 6 };

        moveAllNegativePositive(arr);

        System.out.println("Array after moving negatives to start and positives to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
