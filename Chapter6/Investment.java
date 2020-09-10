/* E6.1
Write a program that reads an initial investment balance and an interest rate, 
then prints the number of years it takes for the investment to reach one million dollars.
*/
import java.util.Scanner;

public class Investment {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the initial balance: ");
        double currBalance = in.nextDouble();
	    System.out.print("Input the interest rate (e.g. 0.05): ");
	    double interestRate = in.nextDouble();

        int years = 0;
 	    while(currBalance <= 1000000) {
             currBalance += currBalance*interestRate;
             years++;
        }
        System.out.println("It'll take " + years + " years to reach one million dollars.");
    }
}