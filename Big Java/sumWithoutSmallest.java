/*E7.3
Write a method sumWithoutSmallest that computes the sum of an array of values, 
except for the smallest one, in a single loop. In the loop, update the sum and 
the smallest value. After the loop, return the difference.
*/

import java.util.Scanner;

public class sumWithoutSmallest { 
public static void main(String[] args) {
	
	int[] myArray = new int[10];
    Scanner in = new Scanner(System.in);
    
    //make sure it's an integer
    System.out.print("Please input 10 numbers: ");
	for(int j = 0; j < myArray.length; j++) {
        myArray[j] = in.nextInt();
    }    

    int minVal = myArray[0];
	int totalSum = 0;

	for(int i = 0; i < myArray.length; i++) {
		totalSum += myArray[i];
		if (myArray[i] < minVal) {
            minVal = myArray[i];
            System.out.println(minVal);
		}
    }
    System.out.println(totalSum);
    System.out.println(minVal);
    int diff = totalSum - minVal;
	System.out.println("The sum of the array without the smallest value is " + diff + ".");

}
}
