/* E4.1/4.2
Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper 
in millimeters. There are 25.4 millimeters per inch. Use constants and comments in your program. 

Write a program that computes and displays the perimeter of a letter-size (8.5 × 11
inches) sheet of paper and the length of its diagonal.
*/

public class LetterSizeDimensions {
    public static void main(String[] args) {

        final double IN_MM_CONVERSION = 25.4;
        final double LETTER_WIDTH = 8.5;
        final double LETTER_LENGTH = 11;

        //conversion from inches to millimeters - beware of overflow error! you can round
        double letter_mm_width = Math.round(LETTER_WIDTH * IN_MM_CONVERSION);
        double letter_mm_length = Math.round(LETTER_LENGTH * IN_MM_CONVERSION);

        System.out.println("The rounded dimensions of the letter-size in millimeters is: " + letter_mm_width + "x" + letter_mm_length);

        //compute the perimeter in inches
        double letterPerimeter = 2 * LETTER_WIDTH + 2 * LETTER_LENGTH;

        System.out.println("The perimeter of a letter is: " + letterPerimeter);

        //computer the diagonal, again beware of overflow
        double letterDiagonal = Math.round(Math.sqrt(Math.pow(LETTER_WIDTH, 2) + Math.pow(LETTER_LENGTH, 2)));

        System.out.println("The rounded diagonal of a letter is: " + letterDiagonal);
    }
}