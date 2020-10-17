import java.util.Scanner;

public class printReversedSentence {

    public static String reverseString(String words) {
        Scanner in = new Scanner(words);
        return reverse(in) + ".";
    }
      
    public static String reverse(Scanner in) {
        if(in.hasNext()) {
            String currWord = in.next();
            if(in.hasNext()) {
                return reverse(in) + " " + currWord;
            }
            return currWord.substring(0, currWord.length()-1);
          }
          //base case
          return "";
    }
    public static void main(String[] args){
        System.out.println(reverseString("Hello my name is Sara."));
    }
}
