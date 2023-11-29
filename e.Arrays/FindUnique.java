public class FindUnique {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,1,6,3,2,5};
        int ans = 0;
        for ( int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
