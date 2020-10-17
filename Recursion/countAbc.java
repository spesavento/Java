//CodingBat: Count recursively the total number of "abc" and "aba" substrings that 
//appear in the given string.
public class countAbc {
    public int countAbc(String str) {
  
        if(str.length() <= 2) {
          return 0;
        }
        String pattern = str.substring(0,3);
        if (pattern.equals("abc") || pattern.equals("aba")) {
          return 1 + countAbc(str.substring(1, str.length()));
          //return 1 + number in rest of stubstring
        } else {
          //return number in rest of stubstring
          return countAbc(str.substring(1, str.length()));
        }
      }
}
