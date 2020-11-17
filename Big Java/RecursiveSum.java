//To compute the sum of values in an array, add the first value
//to the sum of the remaining values
public class RecursiveSum {
    public static int sumVals(int[] myArray, int start) {
        if(start >= myArray.length-1) {
            return myArray[myArray.length-1];
        }
        return myArray[start] + sumVals(myArray, start+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumVals(arr, 0));
    }

    //1 + sumVals(ind 1) = 10!
    //2 + sumVals(ind 2) = 9
    //3 + sumVals(ind 3) = 7
    //return 4

}