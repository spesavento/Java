//CodingBat: Given a string, compute recursively (no loops) the number of "11" substrings
// in the string. The "11" substrings should not overlap.
public class count11 {
    public int count11(String str) {
        if(str.length() <= 1) {
          return 0;
        }
        String pattern = str.substring(0,2);
        if(pattern.equals("11")) {
          return 1 + count11(str.substring(2, str.length()));
        } else {
          return count11(str.substring(1, str.length()));
        }
      }
}
