import java.util.ArrayList;

public class InsertionOfTwoSortedArrays {

    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){

        ArrayList<Integer> list = new ArrayList<>();

        int i =0, j =0;

        while (i< arr1.length && j< arr2.length) {
            if(arr1[i] < arr2[j]){
                i++;
            } else if( arr1[i] > arr2[j]){
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    }
    
    public static void main(String[] args) {
        
        int arr1[] = {1,2,2,3,4,5};
        int arr2[] = {2,4,5,6};

        System.out.println(intersection(arr1, arr2));
    }
}
