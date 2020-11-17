
/*7.3 Modify the LargestInArray.java program in Section 7.3 to mark both the smallest and the largest elements. */
import java.util.Scanner;
import java.util.ArrayList;

/**
 * * This program reads in a sequence of values and prints them, marking the
 * largest value.
 */
public class MinMaxElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        //prompt for a first number before entering while loop
        System.out.print("Please input a number (q to stop): ");
        while (in.hasNextInt()) {
            System.out.print("Please input a number (q to stop): ");
            myNumbers.add(in.nextInt());
        }

        int max = myNumbers.get(0);
        int min = myNumbers.get(0);
        for (int i = 0; i < myNumbers.size(); i++) {
            if (myNumbers.get(i) > max) {
                max = myNumbers.get(i);
            }
            if (myNumbers.get(i) < min) {
                min = myNumbers.get(i);
            }
        }

        for (int elements : myNumbers) {

            System.out.print(elements);
            if (max == min) {
                System.out.print("<== MIN/MAX");
                System.out.println();
            } else if (elements == max) {
                System.out.printf("%8s","<== MAX");
                System.out.println();
            } else if (elements == min) {
                System.out.printf("%8s", "<== MIN"); //defaults to right alignment
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }
}
