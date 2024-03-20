import java.util.HashSet;

public class UnionOfTwoArrays {

    public static HashSet<Integer> unionOfTwoArrays(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr1){
            set.add(num);
        }

        for(int num: arr2){
            set.add(num);
        }

        return set;
    }
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6,8,9};
        int arr2[] = {3,4,5,7, 10};

        System.out.println(unionOfTwoArrays(arr1, arr2));

    }
}
