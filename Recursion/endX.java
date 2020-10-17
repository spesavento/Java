public class endX {
    public String endX(String str) {
  
        //if it's at the end of the string, return ""
        if(str.length() < 1) {
          return str;
        }
        //if it's an x --> return the endX(substring) + "x"
        String currChar = str.substring(0, 1);
        if(currChar.equals("x")) {
          return endX(str.substring(1)) + "x";
        } else {
          return str.substring(0, 1) + endX(str.substring(1)); 
          //else just keep it there 
        }
      }
      
      //xxre
      //churChar == x
      //xre + x  <- but what's xre? hold and figure that out
      //re + x + x <- but what's re? 
      // r + (e) + x + x  what's e? --> return e
            
}
