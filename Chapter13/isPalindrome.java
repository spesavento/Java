public class isPalindrome {
    public static boolean isPalindrome(String text, int start, int end) {
        //if down to 0 or 1 character, it is a palindrome
        if(start >= end) { 
            return true;
        }
        char first = Character.toLowerCase(text.charAt(start));
        char last = Character.toLowerCase(text.charAt(start));
        //if they are both characters
        if(Character.isLetter(first) && Character.isLetter(last)) {
            if(first == last) {
                return isPalindrome(text, start + 1, end - 1);
            } else {
                return false;
            }
        } else if (!Character.isLetter(last)) {
            return isPalindrome(text, start, end - 1);
        } else {
            return isPalindrome(text, start + 1, end);
        }
    }

    public static void main(String[] args) {
        String text = "mom";
        System.out.println(isPalindrome(text, 0, text.length()-1));
        String text2= "Mom!";
        System.out.println(isPalindrome(text2, 0, text.length()-1));
    }
}
