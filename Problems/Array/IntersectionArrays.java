public class IntersectionArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 8, 3};
        int arr2[] = {3, 6, 6};

        for ( int i=0; i<arr1.length; i++){
            int element = arr1[i];
            for ( int j=0; j<arr2.length; j++){
                if ( element == arr2[j]){
                    System.out.println(element);
                    arr2[j] = -23433;
                    break;
                }
            }
        }
    }
}
