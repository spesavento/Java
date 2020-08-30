//import Scanner package
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        //new Scanner object
        Scanner in = new Scanner(System.in);

        //prompt user to enter two words
        System.out.print("Please enter a lowercase word: ");
        String str1 = in.next();
        System.out.print("Please enter a lowercase word: ");
        String str2 = in.next();

        //print the sum of their lengths (an int value)
        int sumLength = str1.length() + str2.length();
        System.out.println(sumLength);

        //is A bigger than B - lexographically? -- use A.compareTo(B) < 0 for A < B
        if(str1.compareTo(str2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Capitalize the first letters and print them together
        String upper1 = str1.substring(0,1).toUpperCase() + str1.substring(1);
        String upper2 = str2.substring(0,1).toUpperCase() + str2.substring(1);        
        System.out.println(upper1);
        System.out.println(upper2);

    }
}