import java.text.DecimalFormat;

public class ArrayAverage {
    public static void main(String[] args) {
        //1. find the average of a 1D array of integers
        double[] a = {1,2,3,4,5,6,23};
        double length = a.length;
        double sum = 0;
        //sum up the numbers
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = sum/length;
       
        //Math.round(average) will round to whole number
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("The average of the 1d array is " + f.format(average));

        //2. find the average of a 2D array of integers
        double[][] b = {{1,2,3,4.3}, {1, 99, 2, 3}};
        double sum2d = 0;
        double elements = 0;
        for(int j = 0; j < b.length; j++) {
            for(int k = 0; k < b[1].length; k++) {
                sum2d += b[j][k];
                elements += 1;
            }
        }

        if(elements != 0) {
            double average2d = sum2d / elements;
            System.out.println("The average of the 2d array is " + f.format(average2d));
        } else {
            System.out.print("Error: Empty array");
        }
    }
}