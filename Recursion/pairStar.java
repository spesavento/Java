public class pairStar {
    public String pairStar(String str) {
        //base case - not always "", it can be the last character
        if(str.length() <= 1) {
          return str;
        }
        //if this one and next one is same, do character + * + pairStar(rest of string)
        String currChar = str.substring(0,1);
        String nextChar = str.substring(1,2);
      
        if(currChar.equals(nextChar)){
          return currChar + "*" + pairStar(str.substring(1));
        } else {
          return currChar + pairStar(str.substring(1));
        }
      }
}
