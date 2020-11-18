public class InsertionSort {
    // sorts the array into increasing order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
        // each outer loop iteration inserts arr[i] into the correct location of
        // the already-sorted sub-list: arr[0] through arr[i-1]
        int valueToInsert = arr[i];
        int loc = 0;
        while (loc < i && arr[loc] < valueToInsert) { // find insertion location
            loc++;
        }

        for (int j = i; j > loc; j--) { // make room for the new value
            arr[j] = arr[j-1];
        }
        arr[loc] = valueToInsert;
        // put the value in correct location in sub-list
        // true here: arr[0] through arr[i] is a sorted sub-list
    }
   }

   public static void main(String[] args){
       int[] test1 = {3, 9, 2};
       insertionSort(test1);
       for(int i = 0; i < test1.length; i++){
           System.out.print(test1[i] + " ");
       }
   }
}
