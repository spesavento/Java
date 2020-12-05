//replace spaces in a string with %20
public class URLify {
    //repl
    //'%20'
    public static String replaceChar(String s){
        //loop through character array and find the number of spaces
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            //if you reach a space use want to 
            if(s.charAt(i) == ' '){
                len += 3;
            } else {
                len += 1;
            }
        }
        //   2
        //"mr John Smith   "
        //make a new character array with the number of spaces needed
        char[] chars = new char[len];
        //copy characters in or %20 if it's a space
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            //if you reach a space use want to 
            if(s.charAt(i) == ' '){
                //track index
                chars[index] = '%';
                chars[index+1] = '2';
                chars[index+2] = '0';
                index += 3;
            } else {
                chars[index] = s.charAt(i);
                index++;
            }
        }
        String urlString = new String(chars);
        return urlString;
    }
    public static void main(String[] args){
        System.out.println(replaceChar("Mr John Smith    "));
    }
}
