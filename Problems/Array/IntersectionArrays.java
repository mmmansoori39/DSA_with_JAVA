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

        // the above will take O(n^2) time complexity
        // but i want to solve it in linear time complexity means O(n)

        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if ( arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
}
