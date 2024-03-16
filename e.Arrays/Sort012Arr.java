import java.util.Arrays;

public class Sort012Arr {

    public static void sort012Arr( int arr[], int n){
        // int zero = 0, one = 0, two = 0;

        // for ( int i=0; i<n; i++){
        //     if (arr[i] == 0) {
        //         zero++;
        //     } else if (arr[i] == 1) {
        //         one++;
        //     } else{
        //         two++;
        //     }
        // }

        // System.out.println("zero "+ zero+one+two);

        int low = 0, mid = 0, high = n-1, temp =0;

        while (mid<= high) {

            switch (arr[mid]) {
                case 0:{
                    temp= arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                
                case 1:{
                    mid++;
                    break;
                }

                case 2: {
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
            
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,2,2,0,0,1,2,0};
        sort012Arr(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
