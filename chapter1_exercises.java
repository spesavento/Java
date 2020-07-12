
import javax.swing.JOptionPane; //dialog viewer for exercises 15-17
import java.net.URL; //used for exercise 18
import javax.swing.ImageIcon; //used for exercise 18
import javax.swing.JOptionPane; //used for exercise 18

public class chapter1_exercises {
    public static void main(String[] args) throws Exception{ 
        //Exercise 1.1: Write a program that prints out Hellos in any language you'd like
        System.out.println("Hello Annyeong");

        //Exercise 1.2: Write a program that prints the sum of the first ten positive integers
        System.out.println(1+2+3+4+5+6+7+8+9+10);

        //Exercise 1.3: Write a program that prints the multiple of the first ten positive integers
        System.out.println(1*2*3*4*5*6*7*8*9*10);

        /* Exercise 1.4: Write a program that prints out the balance of an account after the first, second, and third year. 
        The initial balance is $1,000 and earns 5 percent interest per year. */
        double initialBalance = 1000;

        double yr1Balance = initialBalance + (initialBalance*.05);
        System.out.println(yr1Balance);

        double yr2Balance = yr1Balance + (yr1Balance*.05);
        System.out.println(yr2Balance);
        
        double yr3Balance = yr2Balance + (yr2Balance*.05);
        System.out.println(yr3Balance);

        /* Exercise 1.5: Write a program that displays your name inside a box on the screen using the characters: | - + */
        System.out.println("+----+");
        System.out.println("|Sara|");
        System.out.println("+----+");
        
        /* Exercise 1.6: Write a program that prints your name in large letters (using *'s) */
        System.out.println("*****       *      *****        *");
        System.out.println("*         *   *    *    *     *   *");
        System.out.println("*****    *******   *****     *******");
        System.out.println("    *    *     *   *    *    *     *");
        System.out.println("*****    *     *   *     *   *     *");

        /* Exercise 1.7: Write a program that prints your name Morse code. Use a separate call to System.out.print for each letter.*/
        System.out.print("... "); //s
        System.out.print(".- ");  //a
        System.out.print(". _ . "); //r
        System.out.println(".-"); //a

        /* Exercise 1.8: Write a program that prints a face similar to (but different from) the following. */
        System.out.println("  /////");
        System.out.println(" +'''''+");
        System.out.println("@| * * |@");
        System.out.println(" |  o  |");
        System.out.println(" | \\_/ |"); //notice two \\ are needed since \ alone is used for an escape sequence
        System.out.println(" +-----+");

        /* Exercise 1.9: Write a program that prints out an imitation of a Piet Mondrian painting.
        Use character sequences like @@@ or ::: to indicate different colors and - and | for lines. */
        System.out.println("@@@@@@@@@@@@$::::::::::::\n@@@@@@@@@@@@$::::::::::::\n@@@@@@@@@@@@$::::::::::::\n@@@@@@@@@@@@$::::::::::::\n$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("::::::::::::$::::::::::::\n::::::::::::$::::::::::::\n$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("***$::::::::$######$:::::\n***$::::::::$######$:::::\n***$::::::::$$$$$$$$:::::\n***$::::::::$::::::$:::::");
        
        //Exercise 1.10: Write a program that prints a house that looks exactly like the following.
        System.out.println("   +   ");
        System.out.println("  + +  ");
        System.out.println(" +   + ");
        System.out.println("+-----+");
        System.out.println("| .-. |");
        System.out.println("| | | |");
        System.out.println("+-+-+-+");
        
        //Exercise 1.11: Write a program that prints an animal speaking a greeting, similar (but different from) the following.
        System.out.println("       ______");
        System.out.println("/\\   /        \\        ------");
        System.out.println("\\ \\/       O   \\     / Hi,    \\");
        System.out.println("/ /\\            |   < Whalecome|");
        System.out.println("\\/  \\          /     \\ Friend /");
        System.out.println("      --------         ------");

        //Exercise 1.12: Write a program that prints three items, such as the names of your three best friends or favorite movies, on three separate lines.
        System.out.println("Howl's Moving Castle \nThe Matrix \nCinema Paradiso");

        //Exercise 1.13: Write a program that prints a poem of your choice.
        System.out.println("You may tell that German college that their honour comes too late.");
        System.out.println("But they must not waste repentance on the grizzly savant's fate;");
        System.out.println("Though my soul may set in darkness, it will rise in perfect light;");
        System.out.println("I have loved the stars too truly to be fearful of the night.");
      
        //Exercise 1.14: Write a program that prints the United States flag, using * and = characters.
        System.out.println("********================\n********================\n********================\n********================\n********================\n========================\n========================\n========================\n========================");

        //Exercise 1.15: Type in and run the following program. Then modify it to show the message “Hello, your name!”.
        JOptionPane.showMessageDialog(null, "Hello, Sara!");

        //Exercise 1.16: Type in and run the following program. Then modify it to print “Hello, name!”, displaying the name that the user typed in.
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");

        //Exercise 1.17: Modify the program from Exercise E1.16 so that the dialog continues with the message “My name is Hal! What would you like me to do?” 
        // Discard the user’s input and display a message such as I'm sorry, Dave. I'm afraid I can't do that. Replace Dave with the name that was provided by the user.
        JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
    
        //Exercise 1.18: Type in and run the following program. Then modify it to show a different greeting and image.
        //inside the code: you can use the following
        URL imageLocation = new URL( "http://pets.neopets.com/cp/92x2bdtq/1/4.png");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}