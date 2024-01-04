public class InsertAtEndArray {

    public static int insertAtEndArray(int sizeOfArray, int arr[], int element) {
      return arr[sizeOfArray-1] = element;
    }

    public static void main(String[] args) {
        int sizeOfArray = 6;
        int arr[] = new int[sizeOfArray];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        int element =90;
    System.out.println(insertAtEndArray(sizeOfArray, arr, element));
}
   
}

