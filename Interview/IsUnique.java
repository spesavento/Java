//1.1 implement an algorithm to determine if a string has all unique characters
//what if you cannot use additional data structures?


//long way - a loop that checks the current character and sees if it's in the remaining characters
//hashset - "Sara Pesavento" <- add each character to the hashset -- if you add it and it doesn't change the set
//it means it's already in there
// would S be the same as s? --> then change to lowercase

//no additional data srtuctures?  --- bit vector?

//// how about an nlogn solution, what would that look like?
// have an array of remaining characters and check each character in that array using binary search?
// add first character to new array
// from the next character onwards -- get character and do binary search in the new array


import java.util.HashSet;

public class isUnique {


    private static boolean isUniqueString(String aString) {

        HashSet<Character> chars = new HashSet<Character>();
        for(int i = 0; i < aString.toLowerCase().length(); i++) {
            //returns true if hashset is changed
            if(!chars.add(aString.charAt(i))) {
                //if already in the set
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        //must be static if you are calling it here

        System.out.println(isUniqueString("Sara Pesavento"));
    }
}
