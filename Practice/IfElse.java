import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = in.nextInt();

        if(N % 2 != 0 || (N >= 6 && N <= 20)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}