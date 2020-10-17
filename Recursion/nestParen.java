//CodingBat: Given a string, return true if it is a nesting of zero or more pairs 
//of parenthesis, like "(())" or "((()))"

public class nestParen {
    public boolean nestParen(String str) {
        //base case -- you made it to middle
        if(str.length() <= 0) {
          return true;
        }
        //characters in Java use 'a' and charAt()
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') {
          return nestParen(str.substring(1, str.length()-1));
        } else {
          return false;
        }
      }
}
