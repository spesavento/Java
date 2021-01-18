import java.util.Stack;
import java.util.Scanner;

public class test {
    public static void printReversedSentence(Scanner in) {
        Stack<String> sentence = new Stack<String>();
        while(in.hasNext()){
            String word = in.next();
            
            //if not the last word
            if(in.hasNext()) {
                sentence.push(word);
            } else {
                //first remove period and then stack
                word = word.substring(0, word.length()-1);
                sentence.push(word);
            }
        }
        while(!sentence.empty()) {
            System.out.print(sentence.pop());
            //if that was the last element
            if (sentence.empty()) {
                System.out.println(".");
            } else {
                System.out.print(" ");
            }

            }
        }

    public static void main(String[] args){
        Scanner in = new Scanner("mary had a little lamb.");
        printReversedSentence(in);
    }
}
