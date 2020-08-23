/*
Write a program that initializes a string with "Mississippi". 
Then replace all "i" with "ii" and print the length of the 
resulting string. In that string, replace all "ss" with "s" 
and print the length of the resulting string.
*/
public class ReplaceString {
    public static void main(String[] args) {
        String state = "Mississippi";
        //replace i with ii and store it
        state = state.replace("i", "ii");
        //print the length of the resulting string
        System.out.println(state + " is of length " + state.length());
        //replace ss with s
        state = state.replace("ss", "s");
        //print the length of the resulting string
        System.out.println(state + " is of length " + state.length());
    }
}