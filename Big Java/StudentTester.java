import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Student fred = new Student(100); 
        System.out.println("Please enter values, Q to quit:"); 
        
    
        while (in.hasNextDouble()) {
            if (!fred.addScore(in.nextDouble())) {
                System.out.println("Too many scores.");
                return; 
            }
        }
        
        System.out.println("Whole array: ");
        fred.printArray();
        System.out.println();

        System.out.println("Final score (without lowest): " + fred.finalScore());

        System.out.println();
        
        System.out.println("The smallest element is: " + fred.getMinimum());
        fred.removeMin();
        System.out.println("Removed this element first, and the new minimum is: " + fred.getMinimum());
        System.out.println("Whole array: ");
        fred.printArray();
        System.out.println();
        System.out.println("Final score (without lowest): " + fred.finalScore());

    }
}
