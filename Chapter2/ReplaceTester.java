//E2.6 - Write a program ReplaceTester that encodes a string by replacing all letters 
// "i" with "!" and all letters "s" with "$". Use the replace method. Demonstrate 
// that you can correctly encode the string "Mississippi". Print both the actual and expected result.
public class ReplaceTester {
    public static void main(String[] args) {
        String myString = "Mississippi";
        myString = myString.replace("i", "!");
        myString = myString.replace("s", "$");
        System.out.printf("The expected string is: %15s\n", "M!$$!$$!pp!");
        System.out.printf("The actual result is: %17s\n ", myString);

    }
}
