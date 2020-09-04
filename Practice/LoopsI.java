import java.util.Scanner;

public class LoopsI {
    //print first 10 multiples of N
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //keep taking numbers while they are outside of bounds

        System.out.print("Please input a number from 2 to 20: ");
        int N = in.nextInt();
        while(N < 2 || N > 20) {
            System.out.print("Out of Bounds! Please input a number from 2 to 20: ");
            N = in.nextInt();
        }

        for(int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + i*N);
        }

    }
}
