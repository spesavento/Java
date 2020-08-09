public class ArrayMaximum {
    public static void main(String[] args) {
        //1. find the maximum of a 1D array of integers
        //create the array
        int[] a = {1,6,2,3,10,4};
        int max1d = a[0]; //set the maximum to the first in the array
        for(int i = 0; i < a.length; i++) {
            if (a[i] > max1d) {
                max1d = a[i];
            }
        }
        System.out.println("The maximum of the 1D array is: " + max1d);

        //2. find the maximum of a 2D array of integers
        int[][] b = {{5,6,19,10}, {1,3,4,9}};
        System.out.println("The number of rows is " + b.length); //2 
        System.out.println("The number of columns is " + b[1].length); //4

        int max2d = b[0][0];
        for(int j = 0; j < b.length; j++) {
            for(int k = 0; k < b[1].length; k++) { //if a square, use b.length
                if(b[j][k] > max2d) {
                    max2d = b[j][k];
                }
            }
        }
        System.out.println("The maximum of the 2D array is: " + max2d);
    }
}