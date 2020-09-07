//E2.8 - The StringBuilder class has a method for reversing a string. 
//In a ReverseTester class, construct a StringBuilder from a given string (such as "desserts"), 
//call the reverse method followed by the toString method, and print the result. Also print the expected value.

public class ReverseTester {
    public static void main(String[] args){
        StringBuilder myString = new StringBuilder("desserts");
        String revString = myString.reverse().toString();
        System.out.printf("The expected string is: %10s\n", "stressed");
        System.out.printf("The actual string is: %12s\n", revString);

    }
}
