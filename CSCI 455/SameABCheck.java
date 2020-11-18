import java.util.Stack;

//fix the following method so it returns true iff the a given strings consists of 0 or more 'a' 
//characters followed by the same number of b characters

public class SameABCheck {
    /**
 Returns true iff the given string consists of zero or more 'a' characters
 followed by the same number of 'b' characters.
*/ 
    public static boolean sameABs(String str) {
        Stack<Character> s = new Stack<Character>();
        int i = 0;
        while (i < str.length() && str.charAt(i) == 'a') {
            s.push(str.charAt(i));
            i++;
        }
        while (i < str.length() && str.charAt(i) == 'b') {
            //fix by checking if empty here (for if there are more b's than a's)
            if(s.empty()) {
                return false;
            }
            s.pop();
            i++;
        }
        return (i == str.length() && s.empty());
    }

    public static void main(String[] args){
        System.out.println(sameABs("aabb"));
        System.out.println(sameABs("aab"));
        System.out.println(sameABs("aabbb"));
    }
}
