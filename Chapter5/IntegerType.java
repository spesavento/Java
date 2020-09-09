/* E5.1 
Write a program that reads an integer and prints whether it is negative, zero, or positive.
*/
import java.util.Scanner;
public class IntegerType {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //for one input
        System.out.print("Please input an integer (q to quit): ");
        int userNum = in.nextInt();
        if (userNum < 0) {
            System.out.println("The number is negative.");
        } else if (userNum > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}