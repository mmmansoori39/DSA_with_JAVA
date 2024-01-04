public class PracticeDemo {

    public static void swapAlter(int arr[]){
        int n =  arr.length;

        for ( int i =0 ; i<n; i++){
            if ( i+1 < n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }

        // printing swaped array
        for ( int i =0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void findUnique(int arr[]){
        int ans=0;
        for( int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }   
        System.out.println(ans);
    }

    public static void printMpattern(int n){
        for( int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                if(j == 0 || j == n-1 ||
                i == j && i<n/2 ||
                i+j == n-1 && i<n/2
                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 7, 4, 9, 12, 4, 23 };
        int arr1[] = {2,3,4,6,7,2,6,7,3};
        // swapAlter(arr);
        // findUnique(arr1);
        printMpattern(8);

    }
}
