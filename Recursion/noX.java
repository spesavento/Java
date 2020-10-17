//CodingBat
public class noX {
    public String noX(String str) {
  
        //if the string is now empty return ""
        if(str.length() <= 0) {
          return "";
        }
        
        //if it's an x --> just return the noX(subset without it)
        String myChar = str.substring(0, 1);
        if(myChar.equals("x")) {
          return noX(str.substring(1));
        } else {
          //else keep it + return (subset)
          return myChar + noX(str.substring(1));
        }
      }      
}
