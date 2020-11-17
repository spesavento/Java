
/*E7.1
Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
• Every element at an even index.
• Every even element.
• All elements in reverse order.
• Only the first and last element.
*/
import java.util.Random;

public class ArrayElements {
    public static void main(String[] args) {

        // remember
        int[] myArray = new int[10];

        // nextInt is not a static method. You have to create an instance of Random, and
        // call it as an instance method:
        Random r = new Random();

        // fill in array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = r.nextInt(100);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // every element at an even index
        for (int k = 0; k < myArray.length; k++) {
            if (k % 2 == 0) { // if index is even
                System.out.print(myArray[k] + " ");
            }
        }
        System.out.println();
        // every even element
        for (int l = 0; l < myArray.length; l++) {
            if (myArray[l] % 2 == 0) { // if value is even
                System.out.print(myArray[l] + " ");
            }
        }
        System.out.println();
        // all elements in reverse order
        for (int j = myArray.length - 1; j >= 0; j--) {
            System.out.print(myArray[j] + " ");
        }
        System.out.println();

        // only the first and last element
        System.out.println(myArray[0] + " " + myArray[myArray.length - 1]);

    }
}
