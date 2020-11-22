import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation {
    
    //sara and aras
    //sort and check equality?  --> s1.equals(s2)
    //sorting is too slow -- O(n log n)

    //use some kind of hashmap to store one string

    //what kind of strings? could they include whitespace or special characters?
    //128 characters -- ASCII character set?

        //other thing -- an array with 26 spots where each represents an alphabet letter

    public static final int ASCIICHAR = 128;

    //sara aras  s1.equals(s2) --> sorting in O(n log n)
    public static boolean isPermutation(String s1, String s2){

        if(s1.length() != s2.length()) {
            return false;
        }
        // 'S' 'a' 'r' 'a'
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        int[] alphabet1 = new int[ASCIICHAR];
        int[] alphabet2 = new int[ASCIICHAR];  // or you could remove from the other array

        for(char aChar : char1) {
            alphabet1[aChar]++;
        }
        for(char aChar : char2) {
            alphabet2[aChar]++;
        }
        for(int i = 0; i < ASCIICHAR; i++) {
            //compare alphabet1 and alphabet2
            if(alphabet1[i] != alphabet2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutationHashMap(String s1, String s2){

        Map<Character,Integer> allChars = new HashMap<Character,Integer>();

        // 'S' 'a' 'r' 'a'
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        for(char aChar : char1) {
            if(allChars.containsKey(aChar)){
                allChars.put(aChar, allChars.get(aChar)+1);
            } else {
                allChars.put(aChar, 1);
            }
        }

        for(char aChar : char2) {
            if(allChars.containsKey(aChar)){
                allChars.put(aChar, allChars.get(aChar)-1);
            } else {
                return false;
            }
            if(allChars.get(aChar) < 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPermutation("sara", "Sara"));
        System.out.println(isPermutation("Sara", "Sara"));
        System.out.println(isPermutation("Sa  ra", " Sara "));
        System.out.println(isPermutation("Sa #@ra", " Sa@@ra "));

        System.out.println(isPermutationHashMap("sara", "Sara"));
        System.out.println(isPermutationHashMap("Sara", "Sara"));
        System.out.println(isPermutationHashMap("Sa  ra", " Sara "));
        System.out.println(isPermutationHashMap("Sa #@ra", " Sa@@ra "));
    }
}
