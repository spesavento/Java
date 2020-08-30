import java.util.Scanner;

//test if string is a palindrome
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String myString = in.next();

        //so we already have the string, we can reverse it and check equality
        String revStr = "";
        for(int i = myString.length()-1; i >= 0; i--) {
            revStr += myString.charAt(i);
        }
        System.out.println(myString.equals(revStr) ? "Yes" : "No");
    }
}