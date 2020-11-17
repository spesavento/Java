import java.util.Stack;
import java.util.Scanner;

/**
 * reserve sentences using a stack: e.g.
 * input text:
 * ahem. mary had a little lamb. its fleece was white as snow. the end.
 * corresponding output text:
 * ahem. lamb little a had mary. snow as white was fleece its. end the.
 **/

public class ReverseSentences {

    public static void printReversedSentences(Scanner in) {
        //create an empty Stack
        Stack<String> revSentences = new Stack<String>();
        
        while(in.hasNext()) {
            //keep pushing onto stack until you reach a word with a “.”
            String word = in.next();
            if(word.charAt(word.length()-1) == '.') {

                //push word without "." onto stack
                revSentences.push(word.substring(0, word.length()-1));
                
                //now pop elements until empty, adding spaces between or a period to the last
                while(!revSentences.empty()) {
                    System.out.print(revSentences.pop());
                    //if not last word, “ “, else “.”
                    if(revSentences.empty()) {
                        System.out.print(". ");
                    } else {
                        System.out.print(" ");
                    }
                }
                
            } else {
                revSentences.push(word);
            }
        }
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("ahem. mary had a little lamb. its fleece was white as snow. the end.");
        printReversedSentences(in);
    }
    
}
