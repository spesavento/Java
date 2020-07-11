public class chapter1_exercises {
    public static void main(String[] args){
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
        System.out.println("Howl's Moving Castle");
        System.out.println("The Matrix");
        System.out.println("Cinema Paradiso");

    }
}