//2.7 Write a program HollePrinter that switches the letters "e" and "o" in a string. 
//Use the replace method repeatedly. Demonstrate that the string "Hello, World!" 
//turns into "Holle, Werld!"

public class HollePrinter {
    public static void main(String[] args) {
        
        String origString = "Hello, World!";
        //use uppercase so that when e is replaced with o, it's not replaced again with e's
        origString = origString.replace("e", "O");
        origString = origString.replace("o", "e");
        origString = origString.replace("O", "o");

        System.out.printf("The expected result is: %15s\n", "Holle, Werld!");
        System.out.printf("The actual result is: %17s\n", origString);


    }
}
