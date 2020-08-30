import java.util.Scanner;

public class StdinStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = scan.nextInt();
        System.out.print("Enter a double: ");
        double d = scan.nextDouble(); //everything up to the \n
        scan.nextLine(); //get through current line
        System.out.print("Enter a few words: ");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}