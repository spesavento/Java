public class isPalindrome {
    public static boolean isPalindrome(String word) {
        if(word.length() <= 1) {
            return true;
        }
        String first = word.substring(0,1);
        String last = word.substring(word.length()-1); 

        if(first.equals(last)) { //these are characters 
            return isPalindrome(word.substring(1,word.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("the"));
        System.out.println(isPalindrome("tttt"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abcbca"));
        System.out.println(isPalindrome("abccbaa"));
        System.out.println(isPalindrome("yay"));
        System.out.println(isPalindrome("Yay"));
        System.out.println(isPalindrome("aa"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(""));
    }
}
