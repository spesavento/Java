public class makeString {

    public static String makeString(String[] words) {
        String retString = "";
        return strRecursive(words, 0);
    }
    public static String strRecursive(String[] words, int start) {
        if(words.length < 0 || start >= words.length) {
            return "";
        } else {
             return words[start] + " " + strRecursive(words, start+1);
         }
     }

     public static void main(String[] args) {
         String[] myArray = new String[3];
         myArray[0] = "test";
         myArray[1] = "hello";
         myArray[2] = "yo";
         System.out.println(makeString(myArray));
     }
     
}
