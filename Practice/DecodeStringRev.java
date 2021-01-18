import java.util.Stack;
public class DecodeStringRev {
    public static String decodeString(String s){
        Stack<Integer> numsStack = new Stack<Integer>();
        Stack<StringBuilder> lettersStack = new Stack<StringBuilder>();
        StringBuilder currLetters = new StringBuilder();

        int digits = 0;
    
        //"(ab(d){3}){2}"

        //numsStack: 
        //lettersStack: ""
        //currLetters: "abddd"
        //digits: 3
        //repeat: 3
        //hold : "d"
        for(char curr : s.toCharArray()){
            if(Character.isDigit(curr)){
                //if it is a digit, could span > 1 spaces (e.g. 49[a])
                //don't add it to our stack yet
                digits = digits*10 + curr - '0';

            } else if(curr == '('){
                //push the previous sequence onto the stack
                System.out.println("Pushing " + currLetters.toString() + " onto the lettersStack");
                lettersStack.push(currLetters); 
                //reset the currLetters string builder start fresh
                currLetters = new StringBuilder();
            } else if(curr == ')' || curr == '{'){
                //this sequence is complete and we will be repeating it with the next number in {}
                continue;
            } else if(curr == '}'){
                //we are done reading the number, push it to stack
                numsStack.push(digits);
                int repeat = numsStack.pop();
                StringBuilder hold = currLetters;  
                currLetters = lettersStack.pop();
                for(digits = repeat; digits > 0; digits--){ 
                    currLetters.append(hold); 
                } 
                digits = 0;
            } else {
                currLetters.append(curr);
            }
        }
        return currLetters.toString();
    }
    public static void main(String[] args){
        String s = "(ab(d){3}){2}";
        System.out.println(decodeString(s));
        String s2 = "(d){3}";
        System.out.println(decodeString(s2));
        String s3 = "((a{2})b(d){2})){3}";
        System.out.println(decodeString(s3));
    }
}
