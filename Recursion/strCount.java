public class strCount {
    
    public int strCount(String str, String sub) {
        //if there are less characters than the sub left, no more matches
        if(str.length() < sub.length()) {
          return 0;
        }
        //if it's a match, return 1 + func(remaining characters)
        String pattern = str.substring(0, sub.length());
        if(pattern.equals(sub)) {
          return 1 + strCount(str.substring(sub.length()), sub);
        } else {
          //func(1, remaining characters)
          return strCount(str.substring(1), sub);
        }
      }
}
