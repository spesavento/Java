import java.util.Scanner;

class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = in.next();
        System.out.print("Enter a starting index: ");
        int start = in.nextInt();
        System.out.print("Enter a end (up to this index): ");
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}